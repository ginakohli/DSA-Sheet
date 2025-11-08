class Solution {
    public boolean isPalindrome(String s) {

        String anstr = s.replaceAll("[^0-9A-Za-z]","");
        anstr = anstr.toLowerCase();
        int i = 0;
        int j = anstr.length()-1;
        while(i <= j){
            if(anstr.charAt(i) == anstr.charAt(j)){
                i++;
                j--;

            }
            else{
                return false;
            }
        }
        return true;
    }
}