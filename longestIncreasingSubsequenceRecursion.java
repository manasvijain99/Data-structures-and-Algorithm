// Simple dp solution
package Leetcode;

public class longestIncreasingSubsequenceRecursion {
	 public static int lengthOfLIS(int[] nums) {
	        int n=nums.length;
	        int[] dp=new int[n];
	        int omax=0;
	        for(int i=0;i<n;i++){
	                int max=0;

	            for(int j=0;j<i;j++){
	                if(nums[j]<nums[i]){
	                    if(dp[j]>max){
	                        max=dp[j];
	                    }
	                }
	            }
	            dp[i]=max+1;
	            if(dp[i]>omax){
	            omax=dp[i];
	        }
	        }
	        
	        
	    return omax;
	    }
	 public static void main(String[] args) {
		int[] nums= {10,9,2,5,3,7,101,18};
		int ans=lengthOfLIS( nums);
		System.out.println(ans);
	}

}
