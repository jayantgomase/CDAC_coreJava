package day7;

public class Customer {
	private int id;
	private String name;
	private String address;
	
	@Override
	public String toString() {
		return "Name: " + name + "\tID: " + id + "\tAddress: " + address;
	}
	
	Customer(int id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
