package BinarySearch;

public class Ceiling {

	public static void main(String[] args) {
		int[] arr= {5,7,7,8,8,10};
		int target=8;
		int ans=ceilingNumber(arr,target);
		System.out.println(ans);
		
		char[] arrc= {'c','f','j'};
		char targetc='f';
		char ansc=ceilingchar(arrc,targetc);
		//System.out.println(ansc);
	}

	private static int ceilingNumber(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		if(target>arr[end])
		{
			return -1;
		}
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
			
			
		}
		
		
		
		
		
		return start;
	}
	

	private static char ceilingchar(char[] letters, char target) {
		int start=0;
		int end=letters.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(target < letters[mid])
			{
				end=mid-1;
			}
			else
			{
				
				start=mid+1;

			}
			
			
		}
		
		return letters[start % letters.length];
	}

}
