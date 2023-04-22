package Queue;

public class QueueExample {

	public static void main(String[] args) throws Exception {
		CustomQueue q=new CustomQueue(5);
		q.insert(2);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		q.insert(29);
		
		/*
		 * q.display();
		 * 
		 * q.remove();
		 * 
		 * 
		 * q.display();
		 */
		
		CircularQueue q1=new DynamicQueue(5);
		q1.insert(2);
		q1.insert(4);
		q1.insert(5);
		q1.insert(6);
		q1.insert(29);
		q1.insert(29);

		q1.display();
		
		q1.remove();
		
		q1.display();
		
		

	}

}
