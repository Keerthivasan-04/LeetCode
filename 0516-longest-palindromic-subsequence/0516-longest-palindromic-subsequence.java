class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                int next = dp[j];
                if (a[i] == a[j])    dp[j] = 2 + max;
                max = Math.max(max, next);
            }
        }
        int max = 0;
        for (int i : dp)    max = Math.max(i, max);
        return max;
    }
}