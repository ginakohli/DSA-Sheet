class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        //fixed consecutive window problem - sliding window(code storywith mik)
           int maxUnsatisfied = 0;
           int currUnsatisfied = 0;
     
           int n = customers.length;
           for(int i = 0; i < minutes; i++){
                 currUnsatisfied += customers[i] * grumpy[i];
           } 
           maxUnsatisfied = currUnsatisfied;
           int i = 0;
           int j = minutes;
           while(j < n){
            currUnsatisfied += customers[j] * grumpy[j];
            currUnsatisfied -= customers[i] * grumpy[i];
            maxUnsatisfied = Math.max(maxUnsatisfied, currUnsatisfied);
            i++;
            j++;
           }       

           int totalSatisfied = maxUnsatisfied;
           for(int k = 0; k < n; k++){
            if(grumpy[k] == 0){
             totalSatisfied += customers[k];
            }
           }

           return totalSatisfied;
    }
}