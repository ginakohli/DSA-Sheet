class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(map.containsKey(s)){
                List<String> ls = map.get(s);
                ls.add(str);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(str);
                map.put(s, l);
            }
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}