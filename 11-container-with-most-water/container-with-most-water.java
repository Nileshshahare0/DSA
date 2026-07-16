class Solution {
    public int maxArea(int[] arr) {
        int maxLeng = arr.length-1;
        int i = 0, j = arr.length -1;
        int ans = 0;
        while(i<=j){
            if(arr[i]< arr[j]){
                ans = Math.max(arr[i]*maxLeng-- , ans);
                i++;
            } else if (arr[i] == arr[j]) {
                ans = Math.max(arr[j]*maxLeng , ans);
                i++;
                j--;
                maxLeng -=2;
            }else {
                ans = Math.max(arr[j] * maxLeng--, ans);
                j--;
            }
        }
        return ans;
    }
}