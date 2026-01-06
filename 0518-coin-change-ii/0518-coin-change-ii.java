class Solution {
    public int change(int amount, int[] coins) {

        int[][]memo = new int[coins.length][amount+1];
        for(int []m : memo){
            Arrays.fill(m, -1);
        }
        return solve(amount, coins, 0, memo);
        
    }

    public int solve(int amount, int[] coins, int idx, int[][] memo){

        if(amount == 0){
            return 1;
        }
        if(idx == coins.length){
            return 0;
        }

        if(memo[idx][amount] != -1){
            return memo[idx][amount];
        }

        int take = 0;
        if(coins[idx] <= amount){
            take = solve(amount-coins[idx], coins, idx, memo);
        }

        int skip = solve(amount, coins, idx+1, memo);

        return memo[idx][amount] = take+skip;
    }
}