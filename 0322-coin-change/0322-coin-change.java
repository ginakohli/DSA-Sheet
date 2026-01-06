class Solution {
    public int coinChange(int[] coins, int amount) {
       
        int n = coins.length;
        int[][] memo = new int[coins.length][amount+1];
        for(int []m : memo){
            Arrays.fill(m, -1);
        }
         int ans =  solve(coins, amount, 0, memo);
        if(ans == (int)Math.pow(10,9)){
            return -1;
        }
        return ans;
    }

    public int solve(int[] coins, int amount, int idx, int[][] memo){
        if(amount == 0){
            return 0;
        }
        
        if(idx >= coins.length){
            return (int)Math.pow(10,9);
        }

        if(memo[idx][amount] != -1){
            return memo[idx][amount];
        }
        int take = (int)Math.pow(10,9);

        if(coins[idx] <= amount){
            take = 1 + solve(coins, amount-coins[idx], idx, memo);
        }

        int skip = solve(coins, amount, idx+1, memo);

        return memo[idx][amount]=Math.min(take, skip);
    }
}