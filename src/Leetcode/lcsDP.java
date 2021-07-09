package Leetcode;

public class lcsDP {
	public static int LCS(int n,int m,String str1,String str2) {

//	if(n==0||m==0) {
//		return 0;
//	}
		//char[] ch1=str1.toCharArray();
		//char[] ch2=str2.toCharArray();

	int[][] dp=new int[n+1][m+1];
	for(int i=0;i<n+1;i++) {
		for(int j=0;j<m+1;j++) {
			if(i==0||j==0) {
				dp[i][j]=0;
			}
			else if(str1.charAt(i-1)==str2.charAt(j-1)) {
			dp[i][j]=1+ dp[i-1][j-1];
		}else {
			dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1] );
		}
		
		}}
	return dp[n][m];

	
	
	
}







public static void main(String[] args) {
	
	String str1="abcde";
	String str2="ace";
	System.out.println(LCS(5,3,str1,str2));
	
			// TODO Auto-generated method stub
		

	}

}
