class Solution {
   public boolean detectCapitalUse(String word) {
        String str = word.toUpperCase();
        if(str.equals(word))return true;
        for(int i = 1 ; i< word.length() ; i++){
            char ch = Character.toUpperCase(word.charAt(i));
            if(ch == word.charAt(i))return false;
        }
        return true;
    }
}