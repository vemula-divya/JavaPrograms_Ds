package LinkedList;
public class main {

    public static void main(String[] args) {

        LL l = new LL();
		/*
		 * l.addFirst(7); l.addFirst(17); l.addFirst(47); l.addFirst(87); l.addLast(88);
		 * l.insert(100, 4); l.display(); System.out.println(l.deleteFirst()); //
		 * l.display(); // l.deleteLast(); l.display(); //l.insertRec(100, 2);
		 * l.inserRecursive(2, 100)
		 */;
		 
		 l.addFirst(2);

		 l.addFirst(1);
		 l.addFirst(1);
	      l.display();

        l.removeDuplicates();
        l.display();
        l.isHappy(19);


    }

}