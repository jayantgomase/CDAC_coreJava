package day5;

public class Mango extends Fruit {
	
	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}
	
	
	public String taste() {
		return "sweet";
	}
	
	public void pulp() {
		setName("mango");
		System.out.println(getName());
		setColor("Yellow");
		System.out.println(getColor());
		System.out.println("creating pulp!");
	}
	
}