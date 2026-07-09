class Solution {
      public  String longestPalindrome(String s) {
        String ans = "";
        if(s.length() <=1)return s;
        for(int i = 1 ; i<s.length() ; i++){
            int low = i , high = i;
            while(s.charAt(low) == s.charAt(high)){
                low --;
                high++;
                if(low == -1 || high == s.length()) break;
            }
            String str = s.substring(low+1 , high);
            if(str.length()>ans.length()){
                ans = str;
            }

            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length())break;
            }
            str = s.substring(low+1 , high);
            if(str.length() > ans.length()){
                ans = str;
            }
        }
        return ans;
      }
}