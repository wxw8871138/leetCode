package BD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i>0 &&nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;

            while (left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while (left<right&&nums[left+1]==nums[left]) left++;
                    while (left<right&&nums[right-1]==nums[right]) right--;
                    left++;
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
                else {
                    right--;
                }
            }

        }
        return res;

    }
}
