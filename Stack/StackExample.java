package Stack;

public class StackExample {

	public static void main(String[] args) throws Exception {
		CustomStack s= new DynamicStack(5);
		s.push(6);
		s.push(5);
		s.push(5);
		s.push(5);
		s.push(5);

		s.push(9);

		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println("peek"+s.peek());
	}

}
