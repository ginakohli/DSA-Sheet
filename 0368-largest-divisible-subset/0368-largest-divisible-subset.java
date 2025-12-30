class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {

        
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int[] maxLen = new int[n+1];
        int[] prevIdx = new int[n];
        Arrays.fill(maxLen, 1);
        Arrays.fill(prevIdx, -1);
        int maxIdx = 0;
  
        int maxCount = 0;
        Arrays.sort(nums);
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] % nums[j] == 0){
                       
                        if(maxLen[j]+1>maxLen[i]){
                            maxLen[i] = maxLen[j]+1;
                            prevIdx[i] = j;
                        }

                        if(maxCount<maxLen[i]){
                            maxCount = maxLen[i];
                            maxIdx  = i;
                        }
                }
                }
            }

            while(maxIdx != -1){
                result.add(nums[maxIdx]);
                maxIdx = prevIdx[maxIdx];
            }
                   return result;
        }
 
    }

//            0 1 2
//           [1,2,3]
// maxLen    [1,2,2]
// prevIdx   [-1,0,0]  

    
    

