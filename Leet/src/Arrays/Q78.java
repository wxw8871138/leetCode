package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Q78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums,res,0,new ArrayList<>());
        return res;
    }
    public static void backTrack(int[] nums, List<List<Integer>> res, int start, List<Integer> path){
        res.add(new ArrayList<>(path) );
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backTrack(nums,res,i+1,path);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
