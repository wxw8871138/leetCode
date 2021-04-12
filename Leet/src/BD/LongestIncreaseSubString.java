package BD;

import java.util.ArrayList;

public class LongestIncreaseSubString {
    public int[] LIS (int[] arr) {
        // write code here
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int maxIndex = 0;
        while (right < arr.length-1) {
            if (arr[right+1]>arr[right]){
                right++;
                if (right-left+1>maxLen){
                    maxIndex = left;
                    maxLen = right-left+1;
                }
            }else {
                left++;
                right = right>left?right:left;
            }
        }
        int[] res = new int[maxLen];
        for (int i = maxIndex; i < maxIndex+maxLen; i++) {
            res[i] = arr[maxIndex];
        }
        return res;
    }
}
