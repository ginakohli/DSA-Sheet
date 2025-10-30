class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int len = 0 ;
        int maxLen = 0;
        if(s == null || s.length() == 0){
            return 0;
        }
        for(int i = 0; i < n; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i; j < n; j++){
                if(!set.contains(s.charAt(j))){
                  set.add(s.charAt(j));
                }
                else{
                 break;
                }


            }
            maxLen = Math.max(set.size(), maxLen);
        }
        return maxLen;
    }
}