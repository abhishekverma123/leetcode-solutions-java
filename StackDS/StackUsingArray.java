package StackImplementationUsing_Array;

public class StackUsingArray {

	private int data[];
	private int topIndex;

	public StackUsingArray(int data) {
		this.data = new int[data];
		this.topIndex = -1;

	}

	public void push(int element) throws StackFullException {

		// if stack is full

		if (topIndex == data.length - 1) {
			throw new StackFullException();
		}
		// data[++topIndex] = element;

		this.data[++topIndex] = element;

	}

	public int pop() throws StackEmptyException {
		if (topIndex == -1) {
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}

	public int size() {
		return topIndex + 1;
	}

	public boolean isEmpty() {
		return topIndex == -1;
	}

	public int top() {
		return data[topIndex];
	}

}
