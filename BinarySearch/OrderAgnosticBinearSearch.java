package BinarySearch;

public class OrderAgnosticBinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = { -9, -7, 0, 7, 9, 12, 22, 44, 67 };
		int[] arr= {77,44,66,11,5,4,2,1};
		int target = 66;
		int ans = binarysearch(arr, target);
		System.out.println(ans);

	}

	private static int binarysearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean asc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
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
				if (arr[mid] > target) {
					start = mid + 1;

				} else {
					end = mid - 1;
				}
			}

		}

		return -1;

	}

}
