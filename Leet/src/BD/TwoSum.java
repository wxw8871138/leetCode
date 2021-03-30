package BD;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public int[] twoSum2 (int[] numbers, int target) {
        // write code here Hashmap
        return numbers;
    }
}
