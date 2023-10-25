package day10.custom_ordering;

import java.util.Comparator;

import day10.core.Customer;

public class CustomerDobComparator implements Comparator<Customer> {
	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getDob().compareTo(c2.getDob());
	}

}
