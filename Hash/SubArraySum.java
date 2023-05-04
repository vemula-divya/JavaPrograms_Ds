package Hash;

import java.util.HashMap;

public class SubArraySum {
	
	 public static void main(String[] args) {

		    int[] arr = {1,2,3};
		    int k = 3;

		    HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
		    map.put(0, 1); //sum,freq
		    int ans = 0;
		    int sum = 0;
		    for (int j = 0; j < arr.length; j++) {
		      sum += arr[j];
		      if (map.containsKey(sum - k)) {
		        ans += map.get(sum - k); //1 //2
		      }
		      if (map.containsKey(sum)) {
		        map.put(sum, map.get(sum) + 1);
		      } else {
		        map.put(sum, 1); // 1,1--//3,1
		      }
		    }

		    System.out.println(ans);

		  }
		}

//n2 comp
/*
 * import java.util.*; public class SubArraySum {
 * 
 * public static void main(String[] args) { int[] arr = {1,-1,5,1}; int k = 6;
 * for (int i = 0; i < arr.length; i++) { int sum = 0; for (int j = i; j <
 * arr.length; j++) { sum += arr[j]; if (sum == k) { System.out.println(i +
 * "    " + j); }
 * 
 * } }
 * 
 * }
 * }
 */



