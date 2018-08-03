public class MaxProfit {
	public static int getMaxProfit(int[] stockPrices){
		if (stockPrices.length < 2) {
		    throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
		}

		int minPrice = stockPrices[0];
		int maxProfit = stockPrices[1] - stockPrices[0]; 
		
		for (int price : stockPrices) {
			
			minPrice = Math.min(minPrice, price);
			
			int potentialProfit = minPrice - price;
			
			maxProfit = Math.max(maxProfit, potentialProfit);
		}
		
		return maxProfit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};

		  System.out.println(getMaxProfit(stockPrices));
	}
}