package day7;

import java.util.Scanner;

public class StackTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		Stack stack = null;
		Customer custo;
		
		while(flag) {
			//MENU
			System.out.println("MENU\nChoose from the following Stack prefs:\n1. Fixed Stack\n2. Growable Stack\n3. Push data\n4. Pop Data\n5. Print Stack\n6. Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					stack = new FixedStack();
					break;
					
				case 2:
					stack = new GroweableStack();
					break;
					
				case 3:
					if(stack == null) {
						System.out.println("Please choose a stack type first");
						break;
					}
					System.out.println("Enter the CustomerID, CustomerName, AddressofCustomer :");				
					custo = new Customer(sc.nextInt(), sc.next(), sc.next());
					stack.push(custo);
					System.out.println("data pushed!");
					break;
					
				case 4:
					if(stack == null) {
						System.out.println("Please choose a stack type first");
						break;
					}
					else {
						stack.pop();
						System.out.println("data popped!");
					}
					break;
					
				case 5:
					if(stack == null) {
						System.out.println("Please choose a stack type first");
						break;
					}
					else {
						stack.printStack();
					}
					break;
					
				case 6:
					flag = false;
					System.out.println("Bye...");
					break;
				}		
		
			}
		sc.close();
		}

}
