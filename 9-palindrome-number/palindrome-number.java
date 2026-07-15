class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        if(ispalindrome(x))return true;
        return false;
    }
    public boolean ispalindrome(int n){
        int number = 0;
        int given = n;
        while(n>0){
            int last = n%10;
            number*=10;
            number +=last;
            n/=10;
        }
        System.out.println(number);
        return(number == given );
    }
}