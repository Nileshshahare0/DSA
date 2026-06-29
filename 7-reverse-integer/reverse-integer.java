class Solution {
    public int reverse(int n) {
        int x = Math.abs(n);
        int num = 0;
        while(x>0){
            int a = x % 10;
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && a > 7)) {
                return 0; 
            }
            if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && a < -8)) {
                return 0; 
            }
            num *=10;
            num += a;
            x/=10;
        }
        if(n < 0) return -num;
        return num;
    }
}