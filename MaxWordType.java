package Leetcode;

public class MaxWordType {
	    public static int canBeTypedWords(String text, String brokenLetters) {
	      String[]  arr=text.split(" ");
	        int count=arr.length;
	        for(String i:arr){
	            for(int j=0;j<brokenLetters.length();j++){
	            	//System.out.println(i.indexOf(brokenLetters.charAt(j)));
	            if(i.indexOf(brokenLetters.charAt(j))>=0){

	                count--;
	                break;
	            }
	                
	        }
	        
	    }
			return count;
}
		
	public static void main(String[] args) {
		
		String text="leet code";
		String brockenLetters="lt";
		int ans=canBeTypedWords( text,  brockenLetters);
				System.out.println(ans);
	}

}
