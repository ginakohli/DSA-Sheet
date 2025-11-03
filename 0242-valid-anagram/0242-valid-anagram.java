class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int []map = new int[26];
        for(char c : s.toCharArray()){
            map[c-'a']++;;
        }

        for(char k : t.toCharArray()){
            map[k-'a']--;
            
        }
     
        for(int i = 0; i <26; i++){
            if(map[i] != 0){
                return false;
            }
        }
        return true;
    }
}