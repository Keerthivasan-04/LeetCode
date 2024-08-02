class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }

    public static int solve(int n , int[] dp){
        if(n <= 2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = solve(n-1,dp) + solve(n-2,dp);
    }
}

// class Solution {
//     public int climbStairs(int n) {
        
//         if (n == 1) return 1;
//         if (n == 2) return 2;
        
//         int[] dp = new int[n + 1];
//         dp[1] = 1;
//         dp[2] = 2;
        
//         for (int i = 3; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }
        
//         return dp[n];
//     }
// }

// class Solution {
//     public int climbStairs(int n) {
        
//         if (n == 0 || n==1) 
//             return 1;
        
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }
    
