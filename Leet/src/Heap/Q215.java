package Heap;

import java.util.Arrays;
import java.util.Collections;

public class Q215 {
    public int findKthLargest(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
