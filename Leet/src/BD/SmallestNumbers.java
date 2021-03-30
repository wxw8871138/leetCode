package BD;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(input!=null&&k<=input.length){
            Arrays.sort(input);
            for (int i = 0; i < k; i++) {
                res.add(input[i]);
            }
        }
        return res;

    }
}
