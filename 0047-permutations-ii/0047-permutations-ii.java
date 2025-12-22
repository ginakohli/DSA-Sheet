class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer>ls = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        findUniquePermutations(nums, ls, res, map);

        return res;
        
    }

    public void findUniquePermutations(int[] nums, List<Integer> ls, List<List<Integer>> res, Map<Integer, Integer> map){

            if(ls.size() >= nums.length){
                res.add(new ArrayList<>(ls));
                return;
            }      
            
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > 0){
                    ls.add(entry.getKey());
                    map.put(entry.getKey(), entry.getValue()-1);
                    findUniquePermutations(nums, ls, res, map);
                    map.put(entry.getKey(), entry.getValue()+1);
                    ls.remove(ls.size()-1);
                }
            }




    }
}