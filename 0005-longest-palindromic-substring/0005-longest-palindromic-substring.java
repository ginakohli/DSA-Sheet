class Solution {
    public String longestPalindrome(String s) {

              int n = s.length();
              int idx = 0;
              int maxLen = 1;
              boolean[][] dp = new boolean[n+1][n+1];
             for(int L=1; L <= n; L++){
                for(int i=0; i+L-1 < n; i++){
                    int j = i+L-1;
                    if(L==1){
                        dp[i][j] = true;
                        maxLen = 1;
                    }
                    else if(L==2){
                        if(s.charAt(i)==s.charAt(j)){
                                       dp[i][j] = true;
                                       idx = i;
                                        maxLen = 2;
                        }
                    }
                    else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                        maxLen = L;
                        idx = i;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
             }
        return s.substring(idx, idx + maxLen);
    }

    public boolean checkPalindrome(String s, int i, int j, Boolean[][] dp){
        if(i >= j){
            return true;

        }
        else if(dp[i][j] != null){
            return dp[i][j];
        }
        else if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = checkPalindrome(s, i+1, j-1, dp);
        }
        else{
            return false;
        }

    }

}