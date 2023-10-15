package day7;

public class GroweableStack implements Stack {
	private static Customer[] stack;
	private int top;
	GroweableStack(){
		stack = new Customer[STACK_SIZE];
		top=0;
	}
	
	@Override
	public void push(Customer cust) {
		if(top > stack.length - 1) {
		stack = this.GrowTheStack();
		
		}
		stack[top] = cust;
		top++;
	}
	
	@Override
	public void pop() {
		if(top >= 0) {
		stack[top] = null;
		top--;
		}
		else {
			System.out.println("Underflow!!! (The Stack is EMPTY)");
		}
	}
	
	
	public Customer[] GrowTheStack() {
		 Customer[] temp = new Customer[stack.length * 2];
	     for (int i = 0; i < stack.length; i++) {
	         temp[i] = stack[i];
	     }
	     stack = temp;
	     return stack;
	}
	
	public void printStack() {
		if(stack == null) {
			System.out.println("empty stack");
		}
		else {
			for(int i = 0; i < stack.length; i++ ) {
				System.out.println(stack[i]);
			}
		}
		
	}
	
	
}
