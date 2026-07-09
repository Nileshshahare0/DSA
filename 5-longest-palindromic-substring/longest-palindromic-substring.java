class Solution {
      public  String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int n = Integer.MIN_VALUE ;
        for(int i = 0 ; i<s.length() ; i++){
            for(int j = i ; j<s.length() ; j++){
                String str = s.substring(i,j+1);
                if(isPalindrom(str)){
                    if(n < str.length()){
                        sb.replace(0,sb.length() , str);
                        n = Integer.max(n,str.length());
                        if(n == s.length()) return str;
                    }
                }
            }
        }
        return sb.toString();
    }
    public boolean isPalindrom(String sc){
        for(int i = 0 ; i<sc.length()/2 ; i++){
            if(sc.charAt(i) != sc.charAt(sc.length()-1-i))return false;
        }
        return true;
    }
}