class Solution {
    public int countSubstrings(String s) {

        int count = 0;
        int n = s.length();
        Boolean memo[][] = new Boolean[n+1][n+1];
      
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(isPalindrome(i, j, s, memo)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPalindrome(int i, int j, String s, Boolean memo[][]){
          if(i > j){
            return true;
          }

          if(memo[i][j] != null){
            return memo[i][j];
          }

          if(s.charAt(i) == s.charAt(j)){
            return memo[i][j] = isPalindrome(i+1, j-1, s, memo);
          }

          return false;
    }
}