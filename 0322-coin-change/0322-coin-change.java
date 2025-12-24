class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        Arrays.sort(coins);

        for(int i = 1; i <= amount; i++){
            for(int coin : coins){
                if(i - coin < 0) break;
                if(dp[i-coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i-coin] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE? -1 : dp[amount];
























        // if(amount == 0){
        //     return 0;
        // }

        // if(amount < 0){
        //     return Integer.MAX_VALUE;
        // }
        
        // if(dp[amount] != -1){
        //     return dp[amount];
        // }

        // int sum = Integer.MAX_VALUE;

        // for(int i = 0; i < coins.length; i++){
        //     int res = coinChange(coins, amount-coins[i]);
        //     if(res != Integer.MAX_VALUE){
        //         sum = Math.min(sum,res+1);
        //     }
        // }
        // dp[amount] = sum;
        // return sum;
    }
}