class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        backtrack(nums, ls, result);
        return result;
    
    }

    public void backtrack(int[] nums, List<Integer>ls, List<List<Integer>> res){

        if(ls.size() >= nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
       
        for(int i= 0; i < nums.length; i++){
            if(ls.contains(nums[i])){
                continue;
            }
            ls.add(nums[i]);
            backtrack(nums, ls, res);
            ls.remove(ls.size()-1);
        }
    }
}