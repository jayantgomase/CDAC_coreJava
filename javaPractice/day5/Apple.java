package day5;

public class Apple extends Fruit {
	
	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}
	
	public String taste() {
		return "sweet n sour";
	}
	
	public void jam() {
		setName("apple");
		System.out.println(getName());
		System.out.println("making jam!");
	}
	
}