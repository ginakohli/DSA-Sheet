class Solution {
    public int countSubstrings(String s) {

        int count = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(isPalindrome(i, j, s)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPalindrome(int i, int j, String s){
          if(i > j){
            return true;
          }

          if(s.charAt(i) == s.charAt(j)){
            return isPalindrome(i+1, j-1, s);
          }

          return false;
    }
}