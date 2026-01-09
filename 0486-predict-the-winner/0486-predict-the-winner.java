class Solution {
    public boolean predictTheWinner(int[] nums) {

       if(solve(nums, 0, nums.length-1, 1)>=0){
        return true;
       }
      return false;
        
    }

    public int solve(int[] nums, int start, int end, int firstPlayer){

          if(start > end){
             return 0;
          }
           
          if(firstPlayer == 1){
           int takeFirst = nums[start] + solve(nums, start+1, end, 0);
           int takeLast = nums[end] + solve(nums, start, end-1, 0);
           return Math.max(takeFirst, takeLast);
          }
          else{
            int takeFirst = -nums[start] + solve(nums, start+1, end, 1);
            int takeLast = -nums[end] + solve(nums, start, end-1, 1);
            return Math.min(takeFirst, takeLast);
          }

    }
}