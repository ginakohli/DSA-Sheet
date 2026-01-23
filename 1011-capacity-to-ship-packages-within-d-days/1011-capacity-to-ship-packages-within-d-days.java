class Solution {
    public int shipWithinDays(int[] weights, int days) {

         int minWeight = 0;
         int maxWeight = 0;
         int n = weights.length;

         for(int i : weights){
            minWeight = Math.max(minWeight, i);
            maxWeight += i;
         }

         int low = minWeight;
         int high = maxWeight;
        while(low < high){
            int mid = low + (high-low)/2;
            if(daysRequired(weights, mid) <=days){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }

    public int daysRequired(int[] weights, int capacity){
        int load = 0;
        int days = 1;
        for(int i = 0; i < weights.length; i++){
            if(load+weights[i] > capacity){
                 days+=1;
                 load = weights[i];
            }
            else{
                 load += weights[i];

            }
        }
        return days;
    }
}