package Recursion;

import java.util.Arrays;

public class BubbleSort {

	// it checks for first 2 numbers and swap similar to the whole array
	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}
	

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		// bubbleSort(arr);
		recursionBubbleSort(arr, arr.length - 1, 0);

		System.out.println(Arrays.toString(arr));
	}

	

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] > arr[j - 1]) {
					swap(arr, j, j - 1);
				}
			}
		}

	}
	
	private static void recursionBubbleSort(int[] arr, int r, int c) {
		if (r == 0) {
			return;
		}
		if (c < r) {
			if (arr[c] > arr[c + 1]) {
				swap(arr, c, c + 1);
			}
			recursionBubbleSort(arr, r, c + 1);
		} else {
			recursionBubbleSort(arr, r - 1, 0);

		}

	}

	

}
