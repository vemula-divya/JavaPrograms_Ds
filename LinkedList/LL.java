package LinkedList;
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void addFirst(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;

        if (tail == null) {
            tail = head;
        }

        size += 1;

    }

    public void addLast(int val) {
        if (tail == null) {
            addFirst(val);
            return;
        }

        Node n = new Node(val);
        tail.next = n;
        tail = n;

        size += 1;

    }

    public void insert(int value, int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node n = new Node(value, temp.next);
        temp.next = n;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }
        Node seclast = get(size - 2);
        int val = tail.value;
        tail = seclast;
        tail.next = null;

        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;

        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + "-->");
            n = n.next;
        }
        System.out.print("end");
        System.out.println();
        

    }

    public class Node {

        private int value;
        private Node next;

        public Node(int v) {
            this.value = v;
        }

        public Node(int v, Node n) {
            this.value = v;
            this.next = n;
        }

    }
    
    public void inserRecursive(int index,int value) {
    	head=inserRecursive(index,value,head);
    	
    	
    }

	private Node inserRecursive(int index, int value, Node node) {
		if(index==0)
		{
			Node temp=new Node(value,node);
			size++;		
			return temp;
		}
		
		node.next=inserRecursive(index-1,value,node.next); 
		
		return node;
	}
	
	public void removeDuplicates() {
		Node node=head;
		while(node.next!=null)
		{
			if(node.value == node.next.value)
			{
				node.next=node.next.next;
				size--;

			}else {
			node=node.next;
			}
			tail=node;
			tail.next=null;
			
		}
		
		
	}
	
	 public boolean isHappy(int n) {

	        int slow=n;
	        int fast=n;
	        do{
	            slow=findSquare(slow);
	            fast=findSquare(findSquare(fast));
	        }while(slow!=fast);
	        if(slow==1){
	        return true;
	        }
	        return false;
	     
	    }

	    private int findSquare(int n)
	    {
	        int s = 0;
	         while(n > 0){
	            int rem= n%10;
	            s += rem* rem;
	            n = n/10;
	        }
	        return s;
	    }
  
    
}
