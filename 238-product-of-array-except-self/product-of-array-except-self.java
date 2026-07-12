class Solution {
    public int[] productExceptSelf(int[] num) {
        int[]first = new int[num.length];
        int[] second = new int[num.length];
        int[] ans =  new int [num.length];
        first[0] = 1;
        second[second.length-1] = 1;
        for(int i = 1 ; i<first.length ; i++){
            first[i] = num[i-1]*first[i-1];
        }
        for(int i = second.length-2 ; i>=0 ; i--){
            second[i] = num[i+1] * second[i+1];
        }
        for(int i = 0 ; i<ans.length ; i++){
            ans[i] = first[i]*second[i];
        }

        return ans;
    }
}