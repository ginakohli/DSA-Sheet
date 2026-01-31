class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String, List<String>> map = new HashMap<>();
       
       for(String str : strs){

         char[] freq = new char[26];
         for(Character c: str.toCharArray()){
               freq[c-'a']++;
         }
           String s = Arrays.toString(freq);
           map.computeIfAbsent(s, k->new ArrayList<>()).add(str);
           
       }

       return new ArrayList<>(map.values());
    }
}