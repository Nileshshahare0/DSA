class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)return false;
        if(n == 1)return true;
        int i = n;
        while(i >= 2){
            if( i%2 != 0)return false;
            i = i/2;
        }
        return true;
    }
}