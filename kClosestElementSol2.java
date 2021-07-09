//This is optimized solution
//MEDIUM
package Leetcode;
import java.util.*;

public class kClosestElementSol2 {
	public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0;
		int hi = arr.length - 1;
		while (hi-lo>=k) {
			if (Math.abs(arr[lo] - x) > Math.abs(arr[hi] - x)) {
				lo++;
			} else {
				hi--;
			}
		
		}
		List<Integer> result = new ArrayList<>();
		for (int i = lo; i <= hi; i++) {
			result.add(arr[i]);
		}
		return result;
    }
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		List<Integer> ans=findClosestElements(arr,4,3);
	
		System.out.print(ans);
}
}
