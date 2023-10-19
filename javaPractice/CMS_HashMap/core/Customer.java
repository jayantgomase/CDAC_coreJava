package CMS_HashMap.core;

import java.time.LocalDate;

public class Customer {
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double amount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int id = 1000;
	
	public Customer(String fname, String lname, String email, String password, double amount,
			ServicePlan validPlan,  LocalDate dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.amount = amount;
		this.dob = dob;
		this.plan = validPlan;
		++id;
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", amount=" + amount + ", dob=" + dob + ", plan=" + plan +"]";
	}
}