package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	private TreeNode root;
	class TreeNode {
		
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int i)
		{
			this.data=i;
		}
		
	}
	
	public void createBinaryTree()
	{
		 TreeNode first = new TreeNode(1);
	      TreeNode second = new TreeNode(2);
	      TreeNode third = new TreeNode(3);
	      TreeNode fourth = new TreeNode(4);
	      TreeNode fifth = new TreeNode(5);
	      TreeNode sixth = new TreeNode(6);
	      TreeNode seventh = new TreeNode(7);
	      root=first;
	      first.left=second;
	      first.right=third;
	      second.left=fourth;
	      second.right=fifth;
	      third.left=sixth;
	      third.right=seventh;
	      
	      
//	    	       1
//	    2     				 3
//	4		5			6			7
	      
	      
	}
	
	//------------------recursive--------------------------------------
	public void inOrder(TreeNode root) {
		if(root==null)
		{
			return;
		}	

		inOrder(root.left);
		System.out.print(root.data+"  ");

		inOrder(root.right);	
	}
	
	public void preOrder(TreeNode root) {
		if(root==null)
		{
			return;
		}	
		System.out.print(root.data+"  ");

		preOrder(root.left);
		preOrder(root.right);	
	}
	
	
	
	public void postOrder(TreeNode root) {
		if(root==null)
		{
			return;
		}	

		postOrder(root.left);

		postOrder(root.right);	
		System.out.print(root.data+"  ");

	}
	 //		1

//	2				3
//4		5		6		7

	//------------------iterative--------------------------------------
	
	public void inOrderIterative() {

		if (root == null) {
			return;
		}
		Stack<TreeNode> s = new Stack<>();
		TreeNode temp = root;
		while (!s.isEmpty() || temp != null) {

			if (temp != null) {

				s.push(temp);
				temp = temp.left;

			} else {
				temp = s.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;

			}

		}

	}
	
	public void preOrderIterative() {
	      if (root == null) {
	         return;
	      }

	      Stack<TreeNode> stack = new Stack<>();
	      stack.push(root);

	      while (!stack.isEmpty()) {
	         TreeNode temp = stack.pop();
	         System.out.print(temp.data + " ");
	         if (temp.right != null) {
	            stack.push(temp.right);
	         }
	         if (temp.left != null) {
	            stack.push(temp.left);
	         }
	      }
	   }
	
	
	   public void postOrderIterative() {
		      TreeNode current = root;
		      Stack<TreeNode> stack = new Stack<>();

		      while (current != null || !stack.isEmpty()) {
		         if (current != null) {
		            stack.push(current);
		            current = current.left;
		         } else {
		            TreeNode temp = stack.peek().right;
		            if (temp == null) {
		               temp = stack.pop();
		               System.out.print(temp.data + " ");
		               while (!stack.isEmpty() && temp == stack.peek().right) {
		                  temp = stack.pop();
		                  System.out.print(temp.data + " ");
		               }
		            } else {
		               current = temp;
		            }
		         }
		      }
		   }
	 //level order
	   
	   public static void levelOrder(TreeNode root)
	   {
		   if(root==null)
		   {
			   return ;
		   }
		   
		   Queue<TreeNode> q=new LinkedList<>();
		   q.add(root);
		   q.add(null);
		   while(!q.isEmpty())
		   {
			   TreeNode cur=q.remove();
			   if(cur==null)
			   {
				   System.out.println();
				   if(q.isEmpty())
				   {
					  break;					   
				   }
				   else
				   {
					   q.add(null);
				   }
			   }
			   else
			   {
				   System.out.print(cur.data+" ");
				   if(cur.left!=null)
				   {
					   q.add(cur.left);
				   }
				   if(cur.right!=null)
				   {
					   q.add(cur.right);
				   }
			   }
		   }
		   
		   
		   
		   
		   
	   }
	   
	   
	   //node count
	   public static int nodeCount(TreeNode root)
	   {
		   if(root==null)
		   {
			   return 0;
		   }
		   int leftnode=nodeCount(root.left);
		   
		   int rightnode=nodeCount(root.right);

		    
		return leftnode+rightnode+1;
		   
	   }
	   
	   //node sum
	   public static int nodeSum(TreeNode root)
	   {
		   if(root==null)
		   {
			   return 0;
		   }
		   int leftSum=nodeSum(root.left);
		   
		   int rightSum=nodeSum(root.right);

		    
		return leftSum+rightSum+root.data;
		   
	   }
	   
	 //height
	   public static int height(TreeNode root)
	   {
		   if(root==null)
		   {
			   return 0;
		   }
		   int h1=height(root.left);
		   
		   int h2=height(root.right);
		   
		   int max=Math.max(h1, h2)+1;

		    
		return max;
		   
	   }
	   
	   //diameter 0(n2) compl
	   public static int diameter(TreeNode root)
	   {
		   if(root==null)
		   {
			   return 0;
		   }
		   int d1=diameter(root.left);
		   
		   int d2=diameter(root.right);
		   
		   int d3=height(root.left)+height(root.left)+1;
		   
		   int max=Math.max(d3,Math.max(d1,d2)); 
		    
		return max;
		   
	   }
	   
	   //diameter 0(n) compl
	   
	   
	   //max value 
	   public static int maxValue(TreeNode root)
	   {
		   int max=0;
		   if(root!=null)
		   {
			  
		   int lm=maxValue(root.left);
		   int rm=maxValue(root.right);
		   
           max=Math.max(lm, rm);
		   if(root.data>max)
		   {
			   max=root.data;
		   }
		  
	   }
		   return max ;
	   }


	public static void main(String[] args) {
		 BinaryTree bt = new BinaryTree();
	      bt.createBinaryTree();
			/*
			 * System.out.println("In Order recursive"); bt.inOrder(bt.root);
			 * System.out.println(); System.out.println("pre Order recursive ");
			 * bt.preOrder(bt.root); System.out.println();
			 * System.out.println("post Order recursive"); bt.postOrder(bt.root);
			 * System.out.println();
			 * 
			 * System.out.println("In Order iterative"); bt.inOrderIterative();
			 * System.out.println();
			 * 
			 * System.out.println("pre Order iterative "); bt.preOrderIterative();
			 * System.out.println();
			 * 
			 * System.out.println("post Order iterative"); bt.postOrderIterative();
			 */

	      //levelOrder(bt.root);
			
			/*
			 * int c=nodeCount(bt.root); System.out.println(c);
			 * 
			 * 
			 * 
			 * int c=nodeSum(bt.root); System.out.println(c);
			 * 
			 * 
			 * int h=height(bt.root); System.out.println(h);
			 * 
			 * 
			 * int m=diameter(bt.root); System.out.println(m);
			 */
	      
	      
	      int max=maxValue(bt.root); 
	      System.out.println(max);
	      
	}

}

