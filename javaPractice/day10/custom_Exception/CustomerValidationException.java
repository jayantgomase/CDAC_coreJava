package day10.custom_Exception;

public class CustomerValidationException extends Exception {
	public CustomerValidationException(String errMsg) {
		super(errMsg);
	}
}
