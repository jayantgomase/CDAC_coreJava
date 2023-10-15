package day1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println(" 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide \n 5.Exit \n");
			System.out.println("Enter ur choice : ");
			int choice = sc.nextInt();
			System.out.print("Enter 1st number : ");
			int num1 = sc.nextInt();
			System.out.print("Enter 2nd number : ");
			int num2 = sc.nextInt();
			switch(choice){
				case 1: { System.out.println("Addition = "+ (num1+num2));
					break; }
				case 2: System.out.println("Subtraction = "+ (num1-num2));
					break;
				case 3: { System.out.println("Multiplication = "+ (num1*num2));
					break; }
				case 4: { System.out.println("Division = "+ (num1/num2));
					break; }
				case 5: { System.out.println("Exit");
					exit = false;
					break; }
			}
		}
		sc.close();
	}
}
