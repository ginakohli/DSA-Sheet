class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    
          List<List<Integer>> result = new ArrayList<>();
          List<Integer>list = new ArrayList<>();
          findUniqueCombinationSubarray(candidates, target, list, result, 0);

          return result;

    }

    public void findUniqueCombinationSubarray(int[] candidates, int target, List<Integer> ls, List<List<Integer>> rs, int start){

        if(target<0){
            return;
        }

        if(target == 0){
             rs.add(new ArrayList<>(ls));
             return;
        }

        for(int i = start; i < candidates.length; i++){
            ls.add(candidates[i]);
            findUniqueCombinationSubarray(candidates, target-candidates[i], ls, rs, i);
            ls.remove(ls.size()-1);
        }
        
    }
}