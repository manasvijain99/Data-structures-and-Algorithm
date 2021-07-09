package Leetcode;

public class lcsMemoization {
	public static int LCS(int n,int m,String str1,String str2) {
		if(n==0||m==0) {
			return 0;
		}
		int[][] dp=new int[n+1][m+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<m+1;j++) {
				dp[i][j]=-1;
			}
		}
		
		if(dp[n][m]!=-1) {
		return dp[n][m];
		}
		
		int i=0;
		int j=0;
		while(i<n&&j<m) {
			if(str1.charAt(i)==str2.charAt(j)) {
				dp[n][m]=1+ LCS(n-1,m-1,str1,str2);
			}else {
				dp[n][m]= Math.max(LCS(n,m-1,str1,str2),LCS(n-1,m,str1,str2) );
			}
			i++;
			j++;
		}
		return dp[n][m];
	
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String str1="abcde";
		String str2="ace";
		System.out.println(LCS(5,3,str1,str2));
		
		
	}

}
