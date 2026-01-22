class Solution {
    public List<Integer> findAnagrams(String s, String t) {

        int i = 0;
        int j = 0;
        int count = 0;
        int n = s.length();
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        if(t.length() > s.length()){
            return result;
        }
        for(Character c : t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
      
         count  = map.size();

         while(j < n){

            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0){
                    count --;
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
