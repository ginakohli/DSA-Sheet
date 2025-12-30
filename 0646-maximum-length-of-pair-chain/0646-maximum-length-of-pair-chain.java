class Solution {
    public int findLongestChain(int[][] pairs) {
       Arrays.sort(pairs, (a,b)->a[0]-b[0]);
       int n = pairs.length;
       int[] dp = new int[n+1];
       Arrays.fill(dp, 1);
       int maxLen = 1;
       for(int i = 1; i < n; i++){
        for(int j = 0; j < i; j++){
            if(pairs[j][1]< pairs[i][0]){
                dp[i] = Math.max(dp[i], dp[j]+1);
                maxLen = Math.max(maxLen, dp[i]);
            }
        }
       }
       return maxLen;
    }
   
}
// [1,2][4,5][7,8]
