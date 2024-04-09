package stack;

public class Stack {

	private String input;
	private int front;
	private int capcity;
	private int[] stack;
	
	public Stack(int capacity) {
		this.front=-1;
		this.capcity=capacity;
		this.stack=new int[capacity];
	}
	
	
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public int getFront() {
		return front;
	}
	public void setFront(int front) {
		this.front = front;
	}
	public int getCapcity() {
		return capcity;
	}
	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}
	public int[] getStack() {
		return stack;
	}
	public void setStack(int[] stack) {
		this.stack = stack;
	}
	
	
	public boolean isEmpty() {
		if(this.front ==-1) {
			return true;
		}
		return false;
	}
	
	public void flip() {
		if(!isEmpty()) {
			
		}
	}
	
}