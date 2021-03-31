package BD;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatSubString {
    public static int maxLength (int[] arr) {
        // write code here
        int res = 0;
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                left = Math.max(left,map.get(arr[i])+1);
            }
            map.put(arr[i],i);
            res = Math.max(res,i-left+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,4,3};
        System.out.println(maxLength(arr));
    }
}
