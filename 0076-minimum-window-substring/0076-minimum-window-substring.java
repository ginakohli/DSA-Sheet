class Solution {
    public String minWindow(String s, String t) {

        int i = 0;
        int j = 0;
        int m = s.length();
        int n = t.length();
        int count = n;
        int low = 0;
        int high = 0;
        boolean found = false;
        int minLength = Integer.MAX_VALUE;

        if (s == null || t == null || s.length() < t.length()) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int k = 0; k < n; k++){
              map.put(t.charAt(k), map.getOrDefault(t.charAt(k),0)+1);
        }


         while(j < m){
            
          
                 if(map.containsKey(s.charAt(j))){
                      map.put(s.charAt(j), map.get(s.charAt(j))-1);
                      if(map.get(s.charAt(j)) >= 0){
                         count--;
                  }
                }
                j++;
              
             while(count == 0){

                if(minLength > j-i){
                minLength = j-i;
                low = i;
                high = j;
                found = true;
              }
                
               if(map.containsKey(s.charAt(i))){
                   map.put(s.charAt(i), map.get(s.charAt(i))+1);
                   if(map.get(s.charAt(i)) > 0){
                    count++;
                }
              }
              i++;

              
             }
         }
            if(found == true){
                return s.substring(low, high);
            }
          return "";
         }
        
    }