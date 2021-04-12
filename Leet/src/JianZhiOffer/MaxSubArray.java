package JianZhiOffer;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1]<=0){
                dp[i] = nums[i];
            }else {
                dp[i] = dp[i-1]+nums[i];
            }
            maxSum = Math.max(maxSum,dp[i]);
        }
        return maxSum;

    }
}
