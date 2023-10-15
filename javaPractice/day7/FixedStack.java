package day7;

public class FixedStack implements Stack {
	private Customer[] stack;
	private int top;
	
	FixedStack(){
		stack = new Customer[STACK_SIZE];
		top=-1;
	}
	@Override
	public void push(Customer cust) {
		top++;
		if(top != stack.length) {
		stack[top] = cust;
		}
		else
		{
			System.out.println("Stack Overflow!!!");
		}
	}
	
	@Override
	public void pop() {
		if(top >= 0) {
		stack[top]=null;
		top--;
		}
		else {
			System.out.println("Underflow!!! (The Stack is EMPTY)");
		}
	}
	
	public void printStack() {
		for(int i = 0; i < stack.length; i++ ) {
			if(stack[i] == null) {
				break;
			}
			System.out.println(stack[i]);
		}
	}
}
