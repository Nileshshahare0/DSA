class Solution {
    public int firstUniqChar(String str) {
         int[] chars = new int[27];
        for(int i = 0 ;i< str.length() ; i++){
            int num = str.charAt(i) - 'a';
            chars[num]++;
        }
        for(int i = 0 ; i<str.length() ; i++){
            if(chars[str.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}