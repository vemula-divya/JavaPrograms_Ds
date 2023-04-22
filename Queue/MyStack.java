package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(1);
		myStack.push(2);
		myStack.top(); // return 2
		myStack.pop(); // return 2
		myStack.empty();
	}

    private Queue<Integer> first;
	private Queue<Integer> second;

	public MyStack() {
		first = new LinkedList<Integer>();
		second = new LinkedList<Integer>();
	}
    
    public void push(int x) {
    	second.add(x);
        while(!first.isEmpty())
    	{
    		second.add(first.remove());
    	}
        
        while(!second.isEmpty())
    	{
    		first.add(second.remove());
    	}
    	
    }
    
    public int pop() {
    	
		return first.remove();
        
    }
    
    public int top() {
    	
		return first.peek();
        
    }
    
    public boolean empty() {
		return first.isEmpty()&&second.isEmpty();
        
    }
}

