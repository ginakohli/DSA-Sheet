class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        if(s == null || s.length() == 0){
            return 0;
        }
        int i = 0;
        int j = 0;
        while(j < n){

            if(map.containsKey(s.charAt(j))){
                 i = Math.max(i, map.get(s.charAt(j))+1);
            }
            map.put(s.charAt(j), j);
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
}
