package DP;

public class Q53 {
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num :
                nums) {
            if (sum > 0) {
                sum = sum + num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
    public static int maxSubArray2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
            if(max<dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1};
        System.out.println(maxSubArray(nums));
    }
}
