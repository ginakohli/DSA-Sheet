class Solution {
    public String longestPalindrome(String s) {

              int n = s.length();
              int idx = 0;
              int maxLen = 1;
              for(int i = 0; i < n; i++){
                  for(int j = i; j < n; j++){
                    if(checkPalindrome(s, i, j)){
                        if(j-i+1 > maxLen){
                        maxLen = Math.max(maxLen,j-i+1);
                        idx = i;
                        }
                    }
                  }
              }
        return s.substring(idx, idx + maxLen);
    }

    public boolean checkPalindrome(String s, int i, int j){
        if(i >= j){
            return true;

        }
        else if(s.charAt(i) == s.charAt(j)){
            return checkPalindrome(s, i+1, j-1);
        }
        else{
            return false;
        }

    }

}