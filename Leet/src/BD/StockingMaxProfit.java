package BD;

public class StockingMaxProfit {
    public int maxProfit (int[] prices) {
        // write code here
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                maxProfit = Math.max(maxProfit,prices[i]-minPrice);
            }
        }
        return maxProfit;
    }
}
