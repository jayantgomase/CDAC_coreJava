package CMS_HashMap.utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;

import CMS_HashMap.core.Customer;
import CMS_HashMap.core.ServicePlan;
import CMS_HashMap.custom_Exception.CustomerValidationException;


public class CustomerValidationRules {
	
	public static void checkDuplicates(String email, Map<String, Customer> custMap) throws CustomerValidationException {
		if(custMap.containsKey(email)) { //upcasting String to Object
			throw new CustomerValidationException("Customer already exist!");
		}
	}
	
	public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException { //not necessary bt recommended
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	public static void validateAmount(double amount, ServicePlan plan) throws CustomerValidationException {
		if(!(amount == plan.getCharges())) {
			throw new CustomerValidationException("Amount doesn't match plan Charges!");
		}
	}
	
	// DOB
	public static LocalDate parseDob(String date) throws DateTimeParseException {
		return LocalDate.parse(date);
	}
	
	public static Customer validateAll(String fname, String lname, String email, String password, double amount,
			String plan, String dob, Map<String, Customer> map) throws CustomerValidationException {
		checkDuplicates(email, map);
		ServicePlan validPlan = parseAndValidatePlan(plan);
		validateAmount(amount, validPlan);
		LocalDate dob2 = parseDob(dob);
		return new Customer(fname, lname, email, password, amount, validPlan, dob2);
	}
	
	public static Customer authenticateCustomer(String email, String pwd, Map<String, Customer> customers)
			throws CustomerValidationException {
		Customer customer = customers.get(email);
		if (customer == null)
			throw new CustomerValidationException("Invalid Email !!!");
		// => email ok --chk pwd
		if (!customer.getPassword().equals(pwd))
			throw new CustomerValidationException("Invalid Password!!!");
		return customer;

	}
	
}	