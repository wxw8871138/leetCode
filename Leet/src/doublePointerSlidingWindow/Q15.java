package doublePointerSlidingWindow;

import java.util.*;

public class Q15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List result = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum = nums[left] + nums[right] + nums[i];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    continue;
                }else if(sum<0){
                    left++;
                }else if (sum>0){
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
