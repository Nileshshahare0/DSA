class Solution {
    public int[] twoSum(int[] number, int target) {
       int[]num = new int[2];
       int j = 0;
       int k = number.length -1;
       for(int i = 0 ; i < number.length ; i++){
        if(number[j]+ number[k] == target){
            num[0] = j+1;
            num[1] = k+1;
        }else if(number[j] + number[k] > target){
            k--;
        }else{
            j++;
        }
       }
       return num;
    }
}