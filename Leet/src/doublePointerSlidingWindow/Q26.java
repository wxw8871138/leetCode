package doublePointerSlidingWindow;

public class Q26 {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int length = 1;
        if(nums.length==0){
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[left]!=nums[i]){
                nums[left+1] = nums[i];
                left ++;
                length++;
            }
        }
        return length;
    }
}
