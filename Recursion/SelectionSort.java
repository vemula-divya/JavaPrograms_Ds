package Recursion;

import java.util.Arrays;

public class SelectionSort {
	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	public static void main(String[] args) {
		int[] arr = { 1,5,6,2,4 };
		 //selectionSort(arr);
		 selectionSortRecursion(arr,arr.length , 0,0);

		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSortRecursion(int[] arr, int r, int c,int max) {
		if (r == 0) {
			return;
		}
		if (c < r) {
			if(arr[c]>arr[max])
			{
			selectionSortRecursion(arr,r, c + 1,c);
			}
			else
			{
				selectionSortRecursion(arr,r, c + 1,max);

			}

		} else {
			swap(arr,max,r-1);
			selectionSortRecursion(arr,r-1,0,0);

		}
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			int last=arr.length-i-1;
			int max=getMaxIndex(arr,0,last);
            swap(arr, max, last);
			
		}
		
		
	}

	private static int getMaxIndex(int[] arr, int start, int last) {
		int max=start;
		
		for(int i=start;i<=last;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}

		return max;
	}

}
