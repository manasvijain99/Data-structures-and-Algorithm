//Recursive Solution
package Leetcode;

public class knapsack01 {

	
	public static int Knapsack(int n,int[] wt,int[] val,int W) {

		if(n==0 || W==0) {
			return 0;
		}
		
		if(wt[n-1]<=W) {
			return Math.max((val[n-1]+Knapsack(n-1, wt,  val, W-wt[n-1])),Knapsack(n-1,wt,val,W));
		}else {
			return Knapsack(n-1,wt,val,W);
		}
		
		

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt= {10,20,30};
		int[] val= {60,100,120};
		int W=50;
		int n=wt.length;
		int ans=Knapsack(n,wt,val,W);
		System.out.println(ans);
		

	}

}
