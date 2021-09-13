package Leetcode;

public class LongestPalandromicSubsequence {
	public static int longestPalindromeSubseq(String s) {
        StringBuffer sb=new StringBuffer(s);
        return lcs(s,sb.reverse().toString());
    }
    
    public static int lcs(String a ,String b){
        int m=a.length();
        int n=b.length();
        int t[][]=new int[m+1][n+1];
        
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0)
                    t[i][j]=0;
                else if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else {
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        
        return t[m][n];
        
    }
    public static void main(String[] args) {
    	int ans=longestPalindromeSubseq("abcbcb");
    	System.out.println(ans);
	}
}
