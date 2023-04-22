package Recursion;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
int[] arr= {5,4,3,2,1};

mergeSort(arr);
System.out.println(Arrays.toString(arr));


	}

	private static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int m=arr.length/2;
		
		int[] first=mergeSort(Arrays.copyOfRange(arr,0,m));
		
		int[] second=mergeSort(Arrays.copyOfRange(arr,m,arr.length));

		
		return merge(first,second);
		
		
	}

	private static int[] merge(int[] first, int[] second) {
		int[] max=new int [first.length+second.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<first.length && j<second.length)
		{
			if(first[i]<second[j])
			{
				max[k]=first[i];
				i++;
			}else
			{
				max[k]=second[j];
				j++;
			}
			k++;
		}
		
		while(i<first.length)
		{
			max[k]=first[i];
			i++;
			k++;
		}
		while(j<second.length)
		{
			max[k]=second[j];
			j++;
			k++;
		}
		
		
		return max;
	}

}
