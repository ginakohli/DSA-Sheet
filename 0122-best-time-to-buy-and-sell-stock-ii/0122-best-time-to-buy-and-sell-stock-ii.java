class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int[][] memo = new int[2][n+1];

        for(int[] m : memo){
            Arrays.fill(m, -1);
        }
       return solve(prices, 0, 1, memo);
    }

    public int solve(int[] prices, int i, int canBuy, int[][] memo){

        int profit = 0;

        if(i >= prices.length){
            return 0;
        }

        if(memo[canBuy][i] != -1){
            return memo[canBuy][i];
        }
        if(canBuy == 1){
           int buy = -prices[i] + solve(prices, i+1, 0, memo);
           int skip = 0 + solve(prices, i+1, 1, memo);
           profit = Math.max(buy, skip);
        }
        else{
           int sell = prices[i] + solve(prices, i+1, 1, memo);
           int skip = 0 + solve(prices, i+1, 0, memo);
           profit = Math.max(sell, skip);
        }

        return memo[canBuy][i]=profit;
    }
}
