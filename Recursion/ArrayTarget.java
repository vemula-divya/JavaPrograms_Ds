package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ArrayTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,6,8,12,44,4};
		int target=4;
		//int index=findTarget(arr,target,0);
		//System.out.println(index);
		//List<Integer> l=new ArrayList<>();
		//List<Integer> index1=findTargetList(arr,target,0,l);
		//System.out.println(index1.toString());
		List<Integer> index2=findTargetList(arr,target,0);
		System.out.println(index2.toString());


	}

	private static List<Integer> findTargetList(int[] arr, int target, int i) {
	List<Integer> l=new ArrayList<>();

		if(i==arr.length)
		{
			return l;
		}
		
		
		if(arr[i]==target)
		{
			l.add(i);
			
		}
		List<Integer> ans=findTargetList(arr,target,i+1);
		l.addAll(ans);
		
		return l;
	}

	private static List<Integer> findTargetList(int[] arr, int target, int i, List<Integer> l) {
		if(i==arr.length)
		{
			return l;
		}
		
		
		if(arr[i]==target)
		{
			l.add(i);
			
		}
		return findTargetList(arr,target,i+1,l);
		
	}

	private static int findTarget(int[] arr, int target, int i) {
		if(i==arr.length)
		{
			return -1;
		}
		
		
		if(arr[i]==target)
		{
			return i;
		}else
		{
			return findTarget(arr,target,i+1);
		}
		
		
		
	}

}
