// memorization
// class Solution {

//     public int fib(int n) {
//         int [] dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         return solve(n,dp);
//     }
//     public static int solve(int n , int[] dp){
//         if(n<=1){
//             return n;
//         }
//         if(dp[n] != -1){
//             return dp[n];
//         }    
//         return dp[n] = solve(n-1,dp) + solve(n-2,dp);
//     }
// }

// Tabulation
class Solution {

    public int fib(int n) {
        int [] dp = new int[n+1];
        if(n<=1){
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < n +1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}