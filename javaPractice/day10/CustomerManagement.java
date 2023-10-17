package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Customer> customerList = new ArrayList<>();
		Customer cust1 = new Customer("jay");
		customerList.add(cust1);
	    Customer cust2 = new Customer("omkar");
		customerList.add(cust2);
		
		try {
			
		
//			boolean exit = false;
//			
//			while (!exit) {
//				System.out.println("Choose an option : ");
//				System.out.println("1. Sign up. \t2. Sign in. \t3. Change password. \t4. Unsubscribe customer. \t5.Display all customers. \t0. Exit");
//			
//				try {
//					switch(sc.nextInt()) {
//					case 1 : 
//						Customer cust1 = new Customer(sc.next());
//						customerList.add(cust1);
//						Customer cust2 = new Customer(sc.next());
//						customerList.add(cust2);
//						
//						
//					}
//				} 
//				catch (Exception e) {
//					System.out.println(e);
//					System.out.println("Please Retry..:(");
//					sc.nextLine();
//				}
//			
			
			String email = sc.next();
			CustomerValidationRules.checkDuplicates(email, customerList);
		}
		catch (CustomerValidationException e) {
			System.out.println(e);
			System.out.println("in catch");
		}
		sc.close();
	}
	
}
