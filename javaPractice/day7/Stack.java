package day7;

public interface Stack {
	static final int STACK_SIZE = 2;
	
	public void push(Customer cust);
	public void pop();
	public void printStack();
}

