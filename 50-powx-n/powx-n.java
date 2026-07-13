class Solution {
    public double myPow(double x, int n) {
        int N = n;
        if(n<0){
            x = 1/x;
            N = -n;
        }
        return powers(x,N);
    }
    public double powers(double x , int n){
        if(n == 0){
            return 1;
        }
        double pow = powers(x,n/2);
        double powSqr = pow*pow;
        if(n %2 !=0){
            return x*powSqr;
        }
        return powSqr;
    }
}