class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> freq = new HashMap<>();
        for(Character c:t.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

         int i=0;int j = 0;
         int low = 0;
         int high = 0;
         int minLen = Integer.MAX_VALUE;
         int n = s.length();
         int count = freq.size();
         boolean flag = false;
         while(j < n){
               
            if(freq.containsKey(s.charAt(j))){
                freq.put(s.charAt(j), freq.get(s.charAt(j))-1);

                     if(freq.get(s.charAt(j))==0){
                         count--;
                      }
               }

               j++;

               while(i < n && count == 0){
                   if(freq.containsKey(s.charAt(i))){
                       freq.put(s.charAt(i), freq.get(s.charAt(i))+1);

                       if(freq.get(s.charAt(i))>0
                       ){
                              count++;
                       }
                   }

                   if(minLen > j-i+1){
                       minLen = j-i+1;
                       low = i;
                       high = j;
                    flag = true;
                   }
                   i++;
               }
         }

         if(flag == false){
            return "";
         }
        return s.substring(low, high);
    }
}