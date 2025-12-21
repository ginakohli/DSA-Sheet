class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        backtrack(nums, ls, result, 0);
        return result;
    }

    public void backtrack(int[] nums, List<Integer>ls, List<List<Integer>> res, int start){
        res.add(new ArrayList<>(ls));
        for(int i= start; i < nums.length; i++){
            ls.add(nums[i]);
            backtrack(nums, ls, res, i+1);
            ls.remove(ls.size()-1);
        }
         
     
    }

}