package day10.utils;

import day10.core.Customer;
import day10.custom_Exception.CustomerValidationException;
import java.util.List;

public class CustomerUtils {
	
	public static Customer searchByEmail(String email, List<Customer> customerList)
			throws CustomerValidationException {
		int index;
		Customer newCustomer = new Customer(email);
		if (customerList.contains(newCustomer)) {
			index = customerList.indexOf(newCustomer);
		}
		else {
			throw new CustomerValidationException("Customer does not exist .. ");
		}
		return customerList.get(index);
	}
	
	public static void changePassword(String e, String p, List<Customer> custlist) throws CustomerValidationException{
		Customer temp = searchByEmail(e, custlist);
		temp.setPassword(p);
	}
}
