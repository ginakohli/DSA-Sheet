class Solution {

    int count = 0;
    public int countSubstrings(String s) {

        int n = s.length();
        
        for(int i = 0; i < n; i++){
          checkPalindrome(i, i, s);
          checkPalindrome(i, i+1, s);
        }
        return count;
      }


    public int checkPalindrome(int i, int j, String s){
          while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            count++;
            i--; //expand left
            j++; // expand right
    }
    return count;
    }
}