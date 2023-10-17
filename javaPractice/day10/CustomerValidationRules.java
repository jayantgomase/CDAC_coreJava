package day10;

import java.util.List;


public class CustomerValidationRules {
	
	public static void checkDuplicates(String email, List<Customer> customers) throws CustomerValidationException {
		Customer newCustomer = new Customer(email);
		if (customers.contains(newCustomer)) {
			throw new CustomerValidationException("Customer already exist!");
		}
		System.out.println("Customer added!");
	}
	
	
	public static boolean isPassValid(String email, String pass, List<Customer> customers) {
		Customer tempCustomer = new Customer(email, pass);
		if(customers.contains(tempCustomer)) {
			return true;
		}
		else {
			System.out.println("Invalid password!");
			return false;
		}
		
//	public static String () {
//		
//	}
	}
	
	
}
