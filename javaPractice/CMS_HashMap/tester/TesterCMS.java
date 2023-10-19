package CMS_HashMap.tester;

import static CMS_HashMap.utils.CustomerValidationRules.validateAll;
import static CMS_HashMap.utils.CustomerValidationRules.authenticateCustomer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import CMS_HashMap.core.Customer;

public class TesterCMS {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			boolean exit = false;
			Map<String, Customer> customers = new HashMap<>();
			
			while (!exit) {
				System.out.println("Choose an option : ");
				System.out.println("1. Sign up. \t2. Sign in. \t3. Change password. \n4. "
						+ "Unsubscribe customer. \t5.Display all customers. \t0. Exit");
			
				try {
					switch(sc.nextInt()) {
					case 1 : 
						System.out.println("Enter first name, last name, email, \n password, registrationAmount, plan, DOB : ");
						Customer customer = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), customers);
						customers.put(customer.getEmail(), customer);
						System.out.println("Customer signUp successful!");
						break;
						
					case 2 : 
						System.out.println("Enter email n password : ");
						customer = authenticateCustomer(sc.next(), sc.next(), customers);
						System.out.println("Login successful , your details " + customer);
						break;
						
					case 3 : 
	
						break;
	
					case 4 : 
	
						break;
	
					case 5 : 
	
						break;
	
					case 0 : 
	
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
		catch (Exception e) {
			System.out.println(e);
			System.out.println("in catch");
		}
	}
}
