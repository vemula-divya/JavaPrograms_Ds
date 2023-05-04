package Hash;

import java.util.HashSet;

public class IntersectionArray {
	  public static HashSet < Integer > getIntersection(int[] nums1, int[] nums2) {
		    HashSet < Integer > hs = new HashSet < > ();
		    HashSet < Integer > hs1 = new HashSet < > ();

		    for (Integer n: nums1) {
		      hs.add(n);

		    }
		    for (Integer n: nums2) {
		      if (!hs.add(n)) {
		        hs1.add(n);

		      }

		    }
		    return hs1;

		  }

		    public static void main (String[] args) {
		        int[] nums1={1,3,4,5,8,9};
		         int[] nums2={1,3,10};
		        int freq=3;
		         HashSet<Integer> hs=getIntersection(nums1,nums2);
		         System.out.println(hs);
		         System.out.println(hs.size());

		        
		    }


}
