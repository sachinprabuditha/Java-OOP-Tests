package Stack;

import java.util.EmptyStackException;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size) {
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char c) {
		if (isFull()) {
			System.out.println("Stack is full. Cannot push element: " + c);
			return;
		}
		stackArray[++top] = c;
	}
	
	public char pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stackArray[top--];
	}
	
	public char peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stackArray[top];
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
