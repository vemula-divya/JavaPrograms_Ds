package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,2,4,5};
		boolean b=bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(b);
		
		

	}

	private static boolean bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		boolean swaped=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j] < arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swaped=true;
				}
			}
		}
		
		
		
		
		return swaped;
	}

}
