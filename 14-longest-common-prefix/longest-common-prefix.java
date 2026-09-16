class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
       int i = 0;
       while(i< strs[0].length()){
        boolean test = true;
        for(int j = 1 ; j< strs.length ; j++){
            if( i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){
                test = false;
            }
        }
        if(!test){
            break;
        }
        sb.append(strs[0].charAt(i));
        i++;
       }
       return sb.toString();
    }
}