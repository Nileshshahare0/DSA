class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry =0;
        while(i >= 0 || j >= 0 || carry != 0 ){
            int num1 = i>=0 ? a.charAt(i)-'0' : 0;
            int num2 = j>=0 ? b.charAt(j)-'0' : 0;
            int sum = num1+num2+carry;
            if(sum == 1){
                carry = 0;
                sb.append(1);
            }else if(sum == 2){
                carry = 1;
                sb.append(0);
            }else if(sum == 3){
                carry = 1;
                sb.append(1);
            }else{
                carry = 0;
                sb.append(0);
            }
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}