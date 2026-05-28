package StackImplementationUsing_Array;

public class StackUsingArray {

	private int data[];
	private int topIndex;

	public StackUsingArray(int data) {
		this.data = new int[data];
		this.topIndex = -1;

	}

	public void push(int element) //throws StackFullException
	{

		// if stack is full

		if (topIndex == data.length - 1) {
			// throw new StackFullException();
			doubleCapacity();
		}
		// data[++topIndex] = element;

		this.data[++topIndex] = element;

	}

	private void doubleCapacity() {
		
		int temp[] = data;
		data = new int[2 * temp.length];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
		System.out.println("Double Capacity use !!!");
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
