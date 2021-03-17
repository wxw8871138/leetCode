package doublePointerSlidingWindow;

public class Q121 {
    public static int maxProfit(int[] prices) {
        int miniPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(miniPrice>prices[i]){
                miniPrice = prices[i];
            }else if(prices[i] - miniPrice > maxProfit){
                maxProfit = prices[i] - miniPrice;
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] nums = {2,1,4};
        System.out.println(maxProfit(nums));
    }
}
