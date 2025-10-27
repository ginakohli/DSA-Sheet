class Solution {
    public String longestPalindrome(String s) {

              int n = s.length();
              int idx = 0;
              int maxLen = 1;
              Boolean[][] dp = new Boolean[n+1][n+1];
              for(int i = 0; i < n; i++){
                  for(int j = i; j < n; j++){
                    if(checkPalindrome(s, i, j, dp)){
                        if(j-i+1 > maxLen){
                        maxLen = Math.max(maxLen,j-i+1);
                        idx = i;
                        }
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