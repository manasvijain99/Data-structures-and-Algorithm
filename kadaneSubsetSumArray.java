package Leetcode;


public class kadaneSubsetSumArray {
	public static int maxSubArray(int[] nums) {
        int max_init = nums[0];
        int max_overall=nums[0];
        for(int i=1;i<nums.length;i++){
            max_init = Math.max(max_init+nums[i],nums[i]); //This checks if the same sequence is greater than the new number which is going to get added
            //if the the number which is going to get added is greater it chooses that instead.
            max_overall=Math.max(max_overall,max_init);
        }
        return max_overall;
    }
	public static void main(String[] args) {
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}
}
