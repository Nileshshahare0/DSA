class Solution {
    public boolean isMonotonic(int[] nums) {
        for(int i = 0 ;i<nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                i++;
            }else{
            if(nums[i] < nums[i+1]){
                for(int j = i ; j<nums.length-1 ; j++){
                    if(nums[j] >nums[j+1])return false;
                }
            }else{
                for(int j = i ;j<nums.length-1 ; j++){
                    if(nums[j] < nums[j+1])return false;
                }
            }
            return true;
            }
        }
        return true;
    }
}