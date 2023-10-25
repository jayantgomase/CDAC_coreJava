package day10.tester;

import static day10.utils.CustomerUtils.changePassword;
import static day10.utils.CustomerUtils.searchByEmail;
import static day10.utils.CustomerValidationRules.authenticateCustomer;
import static day10.utils.CustomerValidationRules.validateAll;
import static day10.utils.PopulateData.populateData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import day10.core.Customer;
import day10.custom_Exception.CustomerValidationException;
import day10.custom_ordering.CustomerDobComparator;

public class CustomerManagement {

	public static void main(String[] args) throws CustomerValidationException {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			List<Customer> customerList = new ArrayList<>();
			customerList = populateData();
			boolean exit = false;
			System.out.println("|~~~~~~~~~~Welcome to Customer Management System~~~~~~~~~~|");
			while (!exit) {
				System.out.println("Choose an option : ");
				System.out.println("1. Sign up. \n2. Sign in. \n3. Change password. \n4. Unsubscribe customer. "
						+ "\n5.Display all customers. \n6. Sort customers by email. \n7. Sort customers by DOB. \n0. Exit");
			
				try {
					switch(sc.nextInt()) {
					case 1 : 
						System.out.println("Enter FirstName, LastName, Email,  Password, Registration Amount, "
								+ "Plan(Silver-1000, Gold-2000, Diamond-5000, Platinum-10000), DOB(yyyy-MM-dd) in order : ");
						Customer customer = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(customer);
						System.out.println("Customer signed up !");
						break;
						
					case 2 : 
						System.out.println("Enter email : ");
						String em = sc.next();
						System.out.println("Enter password : ");
						String ps = sc.next();
						customer = authenticateCustomer(em, ps, customerList);
						System.out.println("Login successful , your details " + customer);
						break;
						
					case 3 : 
						System.out.println("Enter email : ");
						String e = sc.next();
						System.out.println("Enter password : ");
						String p = sc.next();
						customer = authenticateCustomer(e, p, customerList);
						System.out.print("Enter the new Password : ");
						String np = sc.next();
						changePassword(e, np, customerList);
						System.out.println("Password changed!");
						break;
	
					case 4 : 
						System.out.println("Enter the email to unsubscribe : ");
						customer = searchByEmail(sc.next(), customerList);
						customerList.remove(customer);
						System.out.println("Customer Unsubscribed!");
						break;
	
					case 5 : 
						for(Customer c : customerList)
							System.out.println(c);
						System.out.println();
						break;
						
					case 6 : 
						// natural ordering
						Collections.sort(customerList);
						System.out.println("Sorted Customers by email : ");
						for(Customer c : customerList)
							System.out.println(c);
						System.out.println();
						break;
						
					case 7 : 
						// custom ordering
						CustomerDobComparator com =  new CustomerDobComparator();
						Collections.sort(customerList, com);
						System.out.println("Sorted Customers by DOB : ");
						for(Customer c : customerList)
							System.out.println(c);
						System.out.println();
						break;
						
					case 0 : 
						exit = true;
						System.out.println("Bye..:)");
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