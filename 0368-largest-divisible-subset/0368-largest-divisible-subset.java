class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        int n=nums.length;
        Arrays.sort(nums);
        int maxL=1;
        int maxIndex=0;
        int []dp= new int [n];
        int []pIndex = new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(pIndex,-1);
        for(int i=1;i<n;i++){
              for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                        pIndex[i]=j;
                    }
                    
                    if(maxL<dp[i]){
                       maxL=dp[i];
                       maxIndex=i;
                    }
                    
                }
              }
        }
        
         List<Integer>list = new ArrayList<>();
         while(maxIndex>=0){
            list.add(nums[maxIndex]);
            maxIndex=pIndex[maxIndex];
         }

return list;
        }
    
}

// [1,2,4,8]