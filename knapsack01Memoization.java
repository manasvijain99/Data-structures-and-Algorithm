//Memoization solution
// Complexity of both recursive and memoization is same O(n^2)
package Leetcode;

public class knapsack01Memoization {
	public static int Knapsack(int n,int[] wt,int[] val,int W) {
		int[][] dp= new int[n+1][W+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<W;j++) {
				dp[i][j]=0;
			}
		}
		if(n==0 || W==0) {
			return 0;
		}
		if(dp[n][W]!=0) {
			return dp[n][W];
		}
		if(wt[n-1]<=W) {
			return dp[n][W]=Math.max((val[n-1]+Knapsack(n-1, wt,  val, W-wt[n-1])),Knapsack(n-1,wt,val,W));
		}else {
			return dp[n][W]= Knapsack(n-1,wt,val,W);
		}
		
		
		
	}
           public static void main(String[] args) {
        	int[] wt= {10,20,30};
       		int[] val= {60,100,120};
       		int W=50;
       		int n=wt.length;
       		int ans=Knapsack(n,wt,val,W);
       		System.out.println(ans);
       		
		}
}
