class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;
        for(int i : piles){
          high = Math.max(high, i);
        }
        while(low < high){
            int mid = low + (high-low)/2;
            if(speedKokoeating(piles, mid) <= h){
                 high = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public int speedKokoeating(int[] piles, int bananas){
        int hours = 0;
        
        for(int i = 0; i < piles.length; i++){
            hours += (piles[i]/bananas);
            if(piles[i]%bananas != 0){
                hours++;
            }
        }

        return hours;
    }
}