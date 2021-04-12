package BD;

public class LongestOalindrome {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        if (A == null || A.length() < 2) {
            return n;
        }
        int maxLen = 1;
        int maxStart = 0;
        int maxEnd = 0;
        boolean[][] dp = new boolean[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if (A.charAt(i) == A.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        maxStart = i;
                        maxEnd = j;
                    }
                }
            }
        }
        return maxLen;
    }
}
