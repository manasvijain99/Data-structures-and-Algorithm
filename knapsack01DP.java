package Leetcode;

public class knapsack01DP {
		public static int Knapsack(int n,int[] wt,int[] val,int W) {
			int[][] dp= new int[n+1][W+1];
			for(int i=0;i<n+1;i++) {
				for(int j=0;j<W+1;j++) {
					if(i==0){
						 dp[i][j]=0;
					}
					else if(j==0) {
						 dp[i][j]=0;

					}
				
			
			
					else if(wt[i-1]<=j) {
				return dp[i][j]=Math.max((val[i-1]+dp[i-1][j-wt[i-1]]),dp[i-1][j]);
			}else {
				return dp[i][j]= dp[i-1][j];
			}
		}
	}
			return dp[n][W];	
			
			
			
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
