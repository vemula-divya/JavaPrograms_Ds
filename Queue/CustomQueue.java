package Queue;

public class CustomQueue {
	
	protected int[] data;

	private final static int DEFAULT_SIZE = 10;

	int end = 0;
	CustomQueue() {
		this(DEFAULT_SIZE);
	}

	CustomQueue(int size) {
		this.data = new int[size];
	}
	

	public boolean isEmpty() {
		
		return end==0;
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
		return true;
	
	}
	
	public int remove() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is empty"); 
		}
		
		int removed=data[0];
		for(int i=1;i<end;i++)
		{
			data[i-1]=data[i];
			
		}
		end--;
		return removed;
	}
	public int front() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is empty"); 
		}
		return data[0];
	}
	
	public void display() {
		for(int i=0;i<end;i++)
		{
			System.out.print(data[i]+"->");
		}
		System.out.println("end");

	}

	
}
