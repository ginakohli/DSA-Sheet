class Solution {
    public int findKthNumber(int m, int n, int k) {

        int l = 1;
        int h = m*n;
        while(l < h){
            int mid = l + (h - l)/2;
            if(countUpperBound(mid,m, n) >= k){
                  h = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }

    public int countUpperBound(int mid,int m, int n ){

        int count = 0;
        for(int i = 1; i <= n; i++){
             if(mid/i > m){
                count += m;
             }
             else{
                 count += (mid/i);
             }
        }
        return count;
    }
}