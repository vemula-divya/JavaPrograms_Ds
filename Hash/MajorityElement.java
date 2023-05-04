package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	 public static ArrayList<Integer> getfreqArray(int[] nums,int f)
     {
         HashMap<Integer,Integer> hm=new HashMap<>();
          ArrayList<Integer> al=new  ArrayList<Integer>();
         int freq=nums.length/f;
         for(int i=0;i<nums.length;i++)
         {
             hm.put(nums[i], hm.containsKey(nums[i])?hm.get(nums[i])+1:1);
         }
         
         for(Map.Entry<Integer,Integer> map:hm.entrySet())
         {
            System.out.println(map.getKey() +" -- "+map.getValue());

             if(map.getValue()>freq)
             {
                 al.add(map.getKey());
             }
         }
         return al;
     }
 
 public static void main (String[] args) {
     //int[] nums={1,3,2,5,1,3,1,5,1};
      int[] nums={1,3};
     int freq=3;
      ArrayList<Integer> al=getfreqArray(nums,freq);
      System.out.println(al);
     
 }

}
