//This solution gives TLE error
package Leetcode;
import java.util.*;

public class kClosestElement {
	
	public static List<Integer> solution(int[] arr ,int k,int x){
		int left=0;
        int right=arr.length;
        int mid= (left+right)/2;
        while(left<=right){
            if(arr[mid]>x){
                right=mid-1;
            }else if(arr[mid]==x){
                break;
            }else{
                left=mid+1;
            }
        }
        List<Integer> res=new ArrayList<>();
       int  l=mid-1;
       int r=mid;
        
        while(l>=0 && r<arr.length && k>0){
        if(Math.abs(x-arr[l])<=Math.abs(x-arr[r])){
            res.add(arr[l]);
            l--;
        }else{
            res.add(arr[r]);
            r++;
        }
            k--;
    }
        while(k>0 && l>=0){
            res.add(arr[l]);
            l--;
            k--;
        }
        while(k>0 && r<arr.length){
            res.add(arr[r]);
            r++;
            k--;
        }
         Collections.sort(res);
        return res;
    
	}
	
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		List<Integer> ans=solution(arr,4,3);
//		for(Integer obj: ans) {
//			System.out.print(ans+" ");
//		}
		System.out.print(ans);
		
		
		
	}

}
