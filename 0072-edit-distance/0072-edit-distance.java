class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();

        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0){
                    dp[i][j] =j;
                }
                else if(j==0){
                    dp[i][j] = i;
                }
                else if(c1[i-1] == c2[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min (dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        return dp[m][n];
    }
}