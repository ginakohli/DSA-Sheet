class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int[][][] memo = new int[n][2][3];

        for(int [][]temp : memo){
            for(int []m : temp){
                Arrays.fill(m, -1);
            }
        }
       return solve(prices, 0, 1, 2, memo);

    }

    public int solve(int[] prices, int idx, int canBuy, int limit, int[][][] memo){
          if(idx >= prices.length){
            return 0;
          }
          if(limit == 0){
            return 0;
          }
          if(memo[idx][canBuy][limit]!=-1){
            return memo[idx][canBuy][limit];
          }
          int profit = 0;

          if(canBuy == 1){
            int buyStock = -prices[idx]+solve(prices, idx+1, 0, limit, memo);
            int skipStock = solve(prices, idx+1, 1, limit, memo);
            profit = Math.max(buyStock, skipStock);
          }
          else{
            int sellStock = prices[idx] + solve(prices, idx+1, 1, limit-1, memo);
            int skipStock = solve(prices, idx+1, 0, limit, memo);
            profit = Math.max(sellStock, skipStock);
          }
          return memo[idx][canBuy][limit]=profit;
    }
}