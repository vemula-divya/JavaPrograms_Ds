package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {


		/*
		 * int num= 565656656; //9896767676
		 * 
		 * int rem=0; int rev=0; while(num>0) { rem=num%10; num=num/10; rev=rev*10+rem;
		 * 
		 * } System.out.println(rev);
		 */
		int[] arr= {1,356,4,6,33,55,88,345};
		int target=356;
		 //System.out.print(searchElement(arr, target));  
		 //System.out.print(maxElement(arr, target));  
		int[][] arr1= {
				{1,2,3,6},
				{88,55,33},
				{55,986,44}
		};
		//System.out.print(searchElement(arr, target));  
		 System.out.print(maxElement2(arr1));  
	}

	private static int maxElement2(int[][] arr1) {
		int max=arr1[0][0];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				 
				 if(arr1[i][j]>max) {
					 max=arr1[i][j];
					 
				 }
			}
		}	
		
		
		return max;
			}

	private static int[] searchElement2(int[][] arr1, int target) {
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j] == target)
				{
					return new int[] {i,j};
				}
			}
		}		
		return new int[] {-1,-1};
	}

	private static int maxElement(int[] arr, int target) {
		if(arr.length<=0)
		{
			return -1;
		}
		int max=Integer.MIN_VALUE;
		
		 for(int x:arr)
		 {
			 if(x>max) {
				 max=x;
			 }
		 }
		
		
		
		return max;
	}

	private static int searchElement(int[] arr, int target) {
		if(arr.length<=0)
		{
			return -1;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
			return i;
			}
		}
		return -1;
	}

}
