package day5;

public class Orange extends Fruit {
	
	public Orange(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}
	
	
	public String taste() {
		return "sour";
	}
	
	public void juice() {
		setName("orange");
		System.out.println(getName());
		setColor("orange");
		System.out.println(getColor());
		System.out.println("creating juice!");
	}
	
}