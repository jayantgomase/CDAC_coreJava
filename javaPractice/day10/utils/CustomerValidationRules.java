package day10.utils;

import java.time.LocalDate;
import static day10.utils.CustomerUtils.searchByEmail;
import java.time.format.DateTimeParseException;
import java.util.List;

import day10.core.Customer;
import day10.core.ServicePlan;
import day10.custom_Exception.CustomerValidationException;

public class CustomerValidationRules {
	
	public static void checkDuplicates(String email, List<Customer> customers) throws CustomerValidationException {
		Customer newCustomer = new Customer(email);
		if (customers.contains(newCustomer)) {
			throw new CustomerValidationException("Customer already exist!");
		}
	}
	
	public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	public static void validateAmount (double amount, ServicePlan plan) throws CustomerValidationException {
		if(amount != plan.getCharges())
			throw new CustomerValidationException("amount doesn't match");
	}

	public static LocalDate parseDob(String date) throws DateTimeParseException {
		return LocalDate.parse(date);
	}
	
	public static Customer validateAll(String firstName, String lastName, String email, String password,
			double regAmount, String plan, String dob, List<Customer> customers) throws CustomerValidationException {
		checkDuplicates(email, customers);
		ServicePlan validPlan = parseAndValidatePlan(plan);
		validateAmount(regAmount, validPlan);
		LocalDate dob2 = parseDob(dob);
		return new Customer(firstName, lastName, email, password, regAmount, validPlan, dob2);
	}
	
	public static Customer authenticateCustomer(String email, String pwd, List<Customer> customers)
			throws CustomerValidationException {
		Customer customer = new Customer(email, pwd);
		if (!customers.contains(customer))
			throw new CustomerValidationException ("Invalid Email !!!");
		else {
		if (!searchByEmail(email, customers).getPassword().equals(pwd))
			throw new CustomerValidationException ("Invalid Password!!!");
		}
		return customer;
	}
	
}