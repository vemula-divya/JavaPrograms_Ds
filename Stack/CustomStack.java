package Stack;

public class CustomStack {
    protected int[] data;
	private final static int DEFAULT_SIZE = 10;
    int ptr = -1;
    CustomStack() {
		this(DEFAULT_SIZE);
	}

	CustomStack(int size) {
		this.data = new int[size];
	}

	public boolean push(int d) {
		if (isFull()) {
			System.out.println("stack is empty");
			return false;
		}
		ptr++;

		data[ptr] = d;
		return true;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("cannot pop from empty stack");
		}

		ptr--;

		return data[ptr];

	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("cannot peek from empty stack");
		}
		return data[ptr];

	}

	public boolean isEmpty() {

		if (ptr == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (ptr == data.length - 1) {
			return true;
		}
		return false;
	}

}
