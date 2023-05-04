package Hash;

import java.util.HashSet;

public class UnionOf2Array {
	 public static HashSet < Integer > getUnion(int[] nums1, int[] nums2) {
		    HashSet < Integer > hs = new HashSet < > ();

		    for (int i = 0; i < nums1.length; i++) {
		      hs.add(nums1[i]);
		    }
		    for (int i = 0; i < nums2.length; i++) {
		      hs.add(nums2[i]);
		    }

		    return hs;
		  }

		    public static void main (String[] args) {
		        int[] nums1={1,3,4,5,8,9};
		         int[] nums2={1,3,10};
		        int freq=3;
		         HashSet<Integer> hs=getUnion(nums1,nums2);
		         System.out.println(hs);
		                  System.out.println(hs.size());

		        
		    }


}
