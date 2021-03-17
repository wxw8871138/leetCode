package doublePointerSlidingWindow;

public class Q11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        max = Math.min(height[left],height[right])*(right-left);
        for (int i = 0; i<height.length-1;i++){
            max = Math.max(max,Math.min(height[left],height[right])*(right-left));
            if (height[left]>=height[right]){
                right--;
            }else {
                left++;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }
}
