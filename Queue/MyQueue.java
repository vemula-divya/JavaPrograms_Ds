package Queue;

import java.util.Stack;

public class MyQueue {

	private Stack<Integer> first;
	private Stack<Integer> second;

	public MyQueue() {
		first = new Stack<Integer>();
		second = new Stack<Integer>();
	}

	public void push(int x) {
		first.push(x);
	}

	public int pop() {
		while(!first.isEmpty())
		{
			second.push(first.pop());
		}
		int pop=second.pop();
		
		while(!second.isEmpty())
		{
			first.push(second.pop());
		}
		return pop;

	}

	public int peek() {
		while(!first.isEmpty())
		{
			second.push(first.pop());
		}
		int peek=second.peek();
		
		while(!second.isEmpty())
		{
			first.push(second.pop());
		}
		return peek;
	}

	public boolean empty() {
		return first.isEmpty();

	}

}
