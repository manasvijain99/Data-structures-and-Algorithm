package Leetcode;

public class StockSellKadane {
	    public static int maxProfit(int prices[]) {
	        int minprice = Integer.MAX_VALUE;
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length; i++) {
	            if (prices[i] < minprice)
	                minprice = prices[i];
	            else if (prices[i] - minprice > maxprofit)
	                maxprofit = prices[i] - minprice;
	        }
	        return maxprofit;
	    }
	
	public static void main(String[] args) {
		int[] arr={7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}
	
	
	
//Different way of doing it but it takes more time
//	 public int maxProfit(int[] prices) {
//	        int minprice=Integer.MAX_VALUE;
//	        int maxprice=0;
//	        for(int i=0;i<prices.length;i++){
//	            minprice=Math.min(minprice,prices[i]);
//	            maxprice=Math.max(maxprice,prices[i]-minprice);
//	        }
//	        return maxprice;
//	    }

}
