package doublePointerSlidingWindow;

public class Q209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum = nums[0];
        int length = Integer.MAX_VALUE;
        while (left<nums.length){
            if(sum>=target){
                length = Math.min(right-left+1,length);
                sum = sum - nums[left];
                left++;
            }else if(sum<target){
                if(right==nums.length-1){
                    break;
                }
                sum = sum + nums[right+1];
                right++;
            }
        }
        if (length == Integer.MAX_VALUE){
            return 0;
        }else {
            return length;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11,nums));
    }
}
