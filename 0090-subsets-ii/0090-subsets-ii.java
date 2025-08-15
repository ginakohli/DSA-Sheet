class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();
        solveSubsetsWithDup(nums, list,0, result);
        return result;
    }

    public void solveSubsetsWithDup(int[] nums, List<Integer>list, int start, List<List<Integer>>result){
    
        result.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            if(i!=start && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            solveSubsetsWithDup(nums, list, i+1, result);
            list.remove(list.size()-1);  
        }
    }
}