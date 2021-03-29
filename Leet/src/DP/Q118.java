package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        Integer[][] dp = new Integer[numRows][numRows];
        dp[0][0] = 1;
        List<Integer> first = new ArrayList<>();
        first.add(dp[0][0]);
        res.add(first);
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            dp[i][0]=1;
            list.add(dp[i][0]);
            dp[i][i]=1;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                list.add(dp[i][j]);
            }
            list.add(dp[i][i]);
            res.add(list);
        }

        return res;
    }

    public static void main(String[] args) {
        generate(5);
    }
}
