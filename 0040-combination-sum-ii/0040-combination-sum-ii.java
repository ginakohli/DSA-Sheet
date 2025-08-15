class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
             Arrays.sort(candidates);
             List<List<Integer>> result = new ArrayList<>();
             List<Integer> ls = new ArrayList<>();
             findCombinationSumII(candidates, target, ls, result, 0);
             return result;
    }

    public void findCombinationSumII(int[] candidates, int target, List<Integer>ls, List<List<Integer>>result, int start){
                      if(target == 0){
                        result.add(new ArrayList<>(ls));
                        return;
                      }
                      if(target < 0){
                        return;
                      }
                      for(int i = start; i < candidates.length; i++){
                        if(i != start && candidates[i] == candidates[i-1]){
                            continue;
                        }
                          ls.add(candidates[i]);
                          findCombinationSumII(candidates, target - candidates[i], ls, result, i+1);
                          ls.remove(ls.size()-1);
                    }
            }
}