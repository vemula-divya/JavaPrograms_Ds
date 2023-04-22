package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {-9,-7,0,7,9,12,22,44,67};
		int target=12;
		int ans=binarysearch(arr,target);
		System.out.println(ans);
		
	}

	private static int binarysearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]<target)
			{
				start=mid+1;
				
			}else if(arr[mid]>target)
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		
		
		
		
		return -1;
	}

}
