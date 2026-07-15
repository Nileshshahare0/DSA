class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int n = x;
        int a = 0;
        while(x>0){
            int num = x%10;
            a = a*10 + num ;
            x/=10;
        }
        return n==a;
    }
    
}