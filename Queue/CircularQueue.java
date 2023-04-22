package Queue;

public class CircularQueue {
	
	protected int[] data;

	private final static int DEFAULT_SIZE = 10;
    protected int front=0;
    protected int end = 0;
    private int size=0;
	CircularQueue() {
		this(DEFAULT_SIZE);
	}

	CircularQueue(int size) {
		this.data = new int[size];
	}
	
public boolean isEmpty() {
		
		return size==0;
	}

	public boolean isFull() {
		return end==data.length;
	}
	
	
	public boolean insert(int d) {
		if(isFull())
		{
			return false;
		}
		data[end++]=d;
		end=end%data.length;
		size++;
		return true;
	
	}
	
	
	public int remove() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is empty"); 
		}
		
		int removed=data[front++];
		front=front% data.length;
		size--;
		return removed;
	}
	
	public int front() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is empty"); 
		}
		return data[front];
	}
	
	public void display() {
		if(isEmpty())
		{
			System.out.println("empty");
			return;
		}
		int i=front;
		do {
			System.out.print(data[i]+"-->");
			i++;
			i %=data.length;
		}while(i!=end);
		System.out.println("end");

	}
}
