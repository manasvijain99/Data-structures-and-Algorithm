package Leetcode;

public class MaxProductSubarray {
		public static int maxAbsoluteSum(int[] nums) {
		    int res = 0, max_sum = 0, min_sum = 0;
		    for (var n : nums) {
		        max_sum = Math.max(0, n + max_sum);
		        min_sum = Math.min(0, n + min_sum);
		        res = Math.max(res, Math.max(Math.abs(max_sum), Math.abs(min_sum)));
		    }
		    return res;
		
	}
		public static void main(String[] args) {
			int[] arr= {1,-3,2,3,-4};
			System.out.println(maxAbsoluteSum(arr));
		}

}
