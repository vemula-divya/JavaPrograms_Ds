package BinarySearch;

public class mountainpeak {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,5,3};
		int peak=findPeak(arr);
		int target=0;
		int index=binarySearch(target,arr,0,peak);
        if(index!=-1){
       System.out.println(index);
       System.exit(0);
        }
    
       System.out.println(binarySearch(target,arr,peak,arr.length-1));
		
	}


public static int findPeak( int[] arr) {

    int start=0;
       int end =arr.length-1;
       while(start<end)
       {
           int mid=start+(end-start)/2;
           if(arr[mid]>arr[mid+1])
           {
              end=mid; 
           }else
           {
               start=mid+1;
           }
           
       }
       return start;
}
public static int binarySearch(int target, int[] arr,int start,int end) {
	boolean asc = arr[start] < arr[end];

    while (start <= end) {
		int mid = start + (end - start) / 2;

		if (arr[mid]== target) {
			return mid;
		}

		if (asc) {
			if (arr[mid] < target) {
				start = mid + 1;

			} else {
				end = mid - 1;
			}
		}else
		{
			if (arr[mid]> target) {
				start = mid + 1;

			} else {
				end = mid - 1;
			}
		}

	}
    return -1;
}
}
