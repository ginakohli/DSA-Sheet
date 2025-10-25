class Solution {
    public int countSubstrings(String s) {

        int count = 0;
        int n = s.length();
        boolean dp[][] = new boolean[n+1][n+1];
      
        for(int L =1; L <= n; L++){
            for(int i = 0; i+L-1 < n; i++){
                int j = i+L-1;
                if(L==1){
                   dp[i][j] = true;
                }
                else if(L==2){
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                }
                else{
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i+1][j-1];
                }

                if(dp[i][j]){
                    count++;
                }
            }
        }
        return count;
    }

    
}