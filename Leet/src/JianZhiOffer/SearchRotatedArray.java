package JianZhiOffer;

public class SearchRotatedArray {
    public int search(int[] nums, int target) {
        int low = 0;
        int hi = nums.length - 1;
        int mid = 0;
        while (low <= hi) {
            mid = low + (hi - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[low]) {
                if (target >= nums[low] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[hi]) {
                    low = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

}
