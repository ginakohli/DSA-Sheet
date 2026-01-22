class Solution {
    public List<Integer> findAnagrams(String s, String t) {
            List<Integer> result = new ArrayList<>();
            int n = s.length();
            Map<Character, Integer> map = new HashMap<>();
            for(Character c : t.toCharArray()){
                map.put(c, map.getOrDefault(c,0)+1);
            }

            int i = 0;
            int j = 0;
            int count = map.size();
            while(j < n){
                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j), map.get(s.charAt(j))-1);
                    if(map.get(s.charAt(j))==0){
                         count--;
                    }
                }
                j++;

                while(count == 0){

                    if(j-i == t.length()){
                        result.add(i);
                    }
                    if(map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i), map.get(s.charAt(i))+1);
                        if(map.get(s.charAt(i))>0){
                            count++;
                        }
                    }

                    i++;
                }
            }
       return result;
    }
}
