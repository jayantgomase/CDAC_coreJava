package day10.core;

import java.time.LocalDate;

public class Customer {
	private int customerId;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double amount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idGenerator = 1000;
	
	public Customer(String fname, String lname, String email, String password, double amount,ServicePlan plan, LocalDate dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.amount = amount;
		this.dob = dob;
		this.plan = plan;
		this.customerId = ++idGenerator;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}
	
	public Customer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "Customer [id=" + customerId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password
				+ ", amount=" + amount + ", dob=" + dob + ", plan=" + plan +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			Customer tempcust = (Customer)obj;
			return this.email.equals(tempcust.email);
		}
		return false;
	}
	
}