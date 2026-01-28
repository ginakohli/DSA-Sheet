class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        int count0 = countSubarrays(nums, k);
        int count1 = countSubarrays(nums, k-1);
        return count0 - count1;
    }

    public int countSubarrays(int[] nums, int k){
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j < n){
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            while(map.size() > k){
                int freq  = map.get(nums[i])-1;
                if(freq == 0){
                    map.remove(nums[i]);
                }
                else{
                map.put(nums[i], freq);
                }
                i++;
            }

                count += j-i+1;
                j++;
            
            
        
        }
    return count;
    }
}