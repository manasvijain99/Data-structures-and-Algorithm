package Leetcode;

public class lcsRecursion {
	
	public static int LCS(int n,int m,String str1,String str2) {
		if(n==0||m==0) {
			return 0;
		}
		int i=0;
		int j=0;
		while(i<n&&j<m) {
			if(str1.charAt(i)==str2.charAt(j)) {
				return 1+ LCS(n-1,m-1,str1,str2);
			}else {
				return Math.max(LCS(n,m-1,str1,str2),LCS(n-1,m,str1,str2) );
			}
			
		}
		return -1;
	
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String str1="abcde";
		String str2="ace";
		System.out.println(LCS(5,3,str1,str2));
		
		
	}

}
