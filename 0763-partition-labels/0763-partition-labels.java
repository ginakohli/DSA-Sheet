class Solution {
    public List<Integer> partitionLabels(String s) {

        int n = s.length();
        int end = 0;
        int size = 0;
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(s.charAt(i), i);
        }

        for(int i = 0; i < n; i++){
             end = Math.max(end, map.get(s.charAt(i)));
            if(end == i){
                size++;
                result.add(size);
                size = 0;
            }
            else{
                size++;
            }
        }
        return result;
    }
}