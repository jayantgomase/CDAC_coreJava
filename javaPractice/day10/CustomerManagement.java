package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static day10.CustomerValidationRules.validateAll;
import static day10.CustomerValidationRules.authenticateCustomer;

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
								"Enter firstName,  lastName,  email,  password, regAmount,  dob(yyyy-MM-dd),  plan");
						Customer customer = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(customer);
						System.out.println("customer signed up !");
						break;
						
					case 2 : 
						System.out.println("Enter email n pwd");
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

