package day10.utils;

import java.util.ArrayList;
import java.util.List;

import static day10.utils.CustomerValidationRules.validateAll;
import day10.core.Customer;
import day10.custom_Exception.CustomerValidationException;

public class PopulateData {
	public static List<Customer> populateData() throws CustomerValidationException {
		List<Customer> customers = new ArrayList<>();
		customers.add(validateAll("jayant", "gomase", "abc", "123", 5000.0, "diamond", "2000-07-08", customers));
		customers.add(validateAll("pranay", "yerpude", "qwe", "456", 2000.0, "gold", "2000-06-13", customers));
		customers.add(validateAll("madhur", "gokhale", "jcsf", "789", 5000.0, "diamond", "1999-11-04", customers));
		customers.add(validateAll("jay", "wath", "abihrc", "123", 1000.0, "silver", "2001-02-08", customers));
		customers.add(validateAll("atul", "seth", "hbfsvabc", "741", 10000.0, "platinum", "1998-10-10", customers));
		customers.add(validateAll("punit", "sharma", "jgb", "852", 5000.0, "diamond", "2002-07-08", customers));
		return customers;
	}
}
