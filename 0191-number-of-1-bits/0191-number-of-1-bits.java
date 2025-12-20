class Solution {
    public int hammingWeight(int n) {

        //appproach 1 , check ith bit if its 1 , increase count
        int count = 0;
    //    for(int i = 31; i>=0; i--){
    //     if(((n >> i) & 1) == 1){
    //          count++;
    //     }
        
    //    }
    //    return count;

    //approacch 2
    //unset bits
    // while(n != 0){
    //     n = n & (n-1);
    //     count++;
    // }
    // return count;
    // }

    //approach 3
    while( n != 0){
        if(n % 2 == 1){
            count ++;
        }
        n = n/2;
    }
return count;
  }
}
//approach 1
//count each bit and unset it to 0 -> n & (n-1)


//approach 2
//take binary of n till n !=0

//approach 3
//Take Integer.BitCount();

//approach 4
// Check if ith bit is equal to 1
