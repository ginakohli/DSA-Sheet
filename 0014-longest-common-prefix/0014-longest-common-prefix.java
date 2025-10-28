class Solution {
    public String longestCommonPrefix(String[] strs) {

     //Brute Force Approach
     //Horizontal Scanning
    //     if(strs.length == 0 || strs == null){
    //         return "";
    //     }

    //     String prefixStr = strs[0];
    //     for(int i = 1; i < strs.length; i++){
    //         while(!strs[i].startsWith(prefixStr)){
    //             prefixStr = prefixStr.substring(0, prefixStr.length()-1);
    //             if(prefixStr.isEmpty()){
    //                 return "";
    //             }
    //         }
    //     }
    //     return prefixStr;
    // }


     //vertical scanning
//      if(strs.length == 0 || strs == null){
//             return "";
//         }
    

//         int len = strs[0].length();
//         for(int i = 0; i < len; i++){
//             Character c = strs[0].charAt(i);
//             for(int j = 1; j < strs.length; j++){
//                 if(i >= strs[j].length() || strs[j].charAt(i)!=c){
//                     return strs[j].substring(0, i);
//                 }
//             }
//         }
//         return strs[0];
//     }

    int n = strs.length;
        String lcp = strs[0];
        String cp = "";
        for(int i = 1; i < n; i++){                                                                                        
             String s = strs[i];
             cp = "";
             for(int j = 0; j < Math.min(s.length(), lcp.length()); j++){
                
                if(lcp.charAt(j) == s.charAt(j)){
                      cp += lcp.charAt(j);
                }
                else{
                    break; 
                }
             }
             lcp = cp;
        }
         return lcp;
    }
}

//Time complexity - O(S) (S-> sum of all characters present in a given string)



//["flower","flow","flight"]
//["flow","flor","flight"]