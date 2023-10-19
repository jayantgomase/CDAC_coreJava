package day10.tester;

import static day10.utils.CustomerValidationRules.authenticateCustomer;
import static day10.utils.CustomerValidationRules.validateAll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day10.core.Customer;

public class CustomerManagement {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			List<Customer> customerList = new ArrayList<>();
			boolean exit = false;
			
			while (!exit) {
				System.out.println("Choose an option : ");
				System.out.println("1. Sign up. \t2. Sign in. \t3. Change password. \t4. Unsubscribe customer. \t5.Display all customers. \t0. Exit");
			
				try {
					switch(sc.nextInt()) {
					case 1 : 
						System.out.println(
								"Enter firstName,  lastName,  email,  password, regAmount, plan, dob(yyyy-MM-dd)");
						Customer customer = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(customer);
						System.out.println("customer signed up !");
						break;
						
					case 2 : 
						System.out.println("Enter email n password : ");
						customer=authenticateCustomer(sc.next(), sc.next(), customerList);
						System.out.println("Login successful , your details " + customer);
						break;
						
					case 3 : 
	
						break;
	
					case 4 : 
	
						break;
	
					case 5 : 
	
						break;
						
						
					}
				} 
				catch (Exception e) {
					System.out.println(e);
					System.out.println("Please Retry..:(");
					sc.nextLine();
				}
			}
		}
	}
}