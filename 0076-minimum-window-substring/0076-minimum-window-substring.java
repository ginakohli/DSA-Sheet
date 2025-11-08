class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i),0)+1);
        }
        int count = freq.size();
        int i = 0;
        int j = 0;
        int low = 0;
        int high = 0;
        int minLength = Integer.MAX_VALUE;
        boolean flag = false;
        while( j < s.length()){

            if(freq.containsKey(s.charAt(j))){
                freq.put(s.charAt(j), freq.get(s.charAt(j))-1);
                if(freq.get(s.charAt(j))==0){
                    count--;
                }
            }
            j++;
            
            while(i < s.length() && count == 0){
                
              if(freq.containsKey(s.charAt(i))){
                freq.put(s.charAt(i), freq.get(s.charAt(i))+1);
                if(freq.get(s.charAt(i))>0){
                    count++;
                }
            }
            
            
            if(minLength > j-i+1){
                minLength = j-i+1;
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