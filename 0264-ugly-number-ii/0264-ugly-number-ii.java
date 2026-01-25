class Solution {
    public int nthUglyNumber(int n) {

        int[] dp = new int[n+1];
        int i2 = 1;
        int i3 = 1;
        int i5 = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
             int i2Ptr = dp[i2] * 2;
             int i3Ptr = dp[i3] * 3;
             int i5Ptr = dp[i5] * 5;
             int min = Math.min(i2Ptr, Math.min(i3Ptr, i5Ptr));
             dp[i] = min;
             if(i2Ptr == min){
                i2++;
             }
             if(i3Ptr == min){
                i3++;
             }
             if(i5Ptr == min){
                i5++;
             }

        }

        return dp[n];
    }
}

//O(nlogn)