package day5;
import java.util.Scanner;
public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		boolean done = false;
		System.out.println("/-----------Welcome to Fruit Basket---------/ \n");
		System.out.println("Enter no. of Fruits : ");
		
		Fruit[] fruits = new Fruit[sc.nextInt()];
		
		while(!done) {
			
			int choice;
			
			System.out.println("\n Enter your choice : ");
			System.out.println(" 1. Add mango \n 2. Add orange \n 3. Add apple \n 4. Display all fruits. \n 5. Display all fruits with taste. \n 6. Mark Stale \n 7. Make all sour fruits stale. \n 8. Invoke fruit specific functionality (pulp / juice / jam). \n 9. EXIT \n\n");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : 
				if(count == fruits.length) {
					System.out.println("basket full!");
					break;
				}
				else {
					fruits[count++] = new Mango("yellow", 30, "mango", true);
					System.out.println("Mangoango added!");
					break;
				}
				
			
			case 2 : 
				if(count == fruits.length) {
					System.out.println("basket full!");
					break;
				}
				else {
					fruits[count++] = new Orange("orange", 20, "orange", true);
					System.out.println("Orange added!");
					break;
				}
			
			case 3 : 
				if(count == fruits.length) {
					System.out.println("basket full!");
					break;
				}
				else {
					fruits[count++] = new Apple("red", 10, "apple", true);
					System.out.println("Apple added!");
					break;
				}
			
			case 4 : 
				for(Fruit f : fruits) {
					System.out.println(f);
				}
				break;
			
			case 5 :
				for(int i = 0; i < fruits.length; i++) {
					System.out.println(fruits[i].getName() + " " + fruits[i].getColor() + " " + fruits[i].getWeight() + " " + fruits[i].taste());
				}
				break;
				
			case 6 :
				System.out.println("Enter index of fruit : ");
				int input;
				input = sc.nextInt();
				if(input > 0 && input < fruits.length) {
					fruits[input].setFresh(false);
					System.out.println("fruit made stale!");
				}
				else {
					System.out.println("invalid index!");
				}
				break;
				
			case 7 :
				for (int i = 0; i < fruits.length; i++) {
					if((fruits[i].taste()).equals("sour")) {
						fruits[i].setFresh(false);
					}
				}
				System.out.println("sour fruits made stale!");
				break;
				
			case 8 :
				System.out.println("Enter index of fruits : ");
				int index = 0;
				index = sc.nextInt();
				if (index < fruits.length) {
					if(fruits[index] instanceof Mango) {
						((Mango)fruits[index]).pulp();
						break;
					}
					else if(fruits[index] instanceof Orange) {
						((Orange)fruits[index]).juice();
						break;
					}
					else if(fruits[index] instanceof Apple) {
						((Apple)fruits[index]).jam();
						break;
					}
				}
				else {
					System.out.println("invald index!");
					break;
				}
				
				
			case 9 :
				done = true;
				System.out.println("Bye.....");
		}
		
		
		//for
		//f.taste().equals("sour")
		//f.freah(false)
		}
			
		
		
		sc.close();
	}

}