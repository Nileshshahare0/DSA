class Solution {
    public String convertToBase7(int num) {
        StringBuilder str  = new StringBuilder();
        boolean a = (num < 0);
        int b = num;
        if(num == 0)return str.append(num).toString();
        num = Math.abs(num);
        while(num != 0){
            str.append(num%7);
            num/=7;
        }
        if(a) return str.append('-').reverse().toString();
        return str.reverse().toString();
    }
}