package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,1,2,3};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
		

	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			int last=arr.length-i-1;
			int maxIndex=getMaxIndex(arr,0, last);
			swap(arr,maxIndex,last);
			
			
			
		}
		
		
		
		
	}
	
	static void swap(int[] arr,int first,int last)
	{
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}

	private static int getMaxIndex(int[] arr,int start, int end) {
		int max=start;
		for(int i=start;i<=end;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
			
		}
		
		
		return max;
	}

}
