package BD;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k){
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int target = len-k;
        while(true){
            int index = partition(nums,left,right);
            if (index == target){
                return nums[index];
            }else if(index<target){
                left = index+1;
            }else {
                right = index - 1;
            }
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left;
        for (int i = left+1; i < right ; i++) {
            if(nums[i]<pivot){
                j++;
                swap(nums,j,i);
            }
        }
        swap(nums,j,left);
        return j;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
