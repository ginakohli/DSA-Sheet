class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        backtrack(n, k, res, ls, 1);
        return res;
        
    }

    public void backtrack(int n, int k, List<List<Integer>> res, List<Integer> ls, int start){
        if(ls.size() == k){
            res.add(new ArrayList<>(ls));
            return;
        }

        for(int i = start; i <= n; i++){
            ls.add(i);
            backtrack(n, k, res, ls, i+1);
            ls.remove(ls.size()-1);

        }
     }
}