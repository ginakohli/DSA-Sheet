class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

      int[][] memo = new int[2][n+1];

      for(int []m : memo){
        Arrays.fill(m, -1);
      }

      return solve(prices, memo, 1, 0 );

    }

    public int solve(int[] prices, int[][]memo, int buy, int i){

        int profit = 0;

        if(i >= prices.length){
            return 0;
        }

        if(memo[buy][i]!=-1){
            return memo[buy][i];
        }
  
        if(buy == 1){
            int buyStock = -prices[i] + solve(prices, memo, 0, i+1);
            int skipStock = solve(prices, memo, 1, i+1);
            profit = Math.max(buyStock, skipStock);
        }
        else{
            int sellStock = prices[i] + solve(prices, memo, 1, i+1);
            int skipStock = solve(prices, memo, 0, i+1);
            profit = Math.max(sellStock, skipStock);
        }
     return memo[buy][i] = profit;
    }
}
