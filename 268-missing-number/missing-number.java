class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = nums.length;
        int max = 0;
        boolean zeros = false;
        for(int i = 0 ; i<nums.length ; i++){
            sum1+=nums[i];
            sum2+=i;
            max = Math.max(max,nums[i]);
            if(nums[i] == 0) zeros = true;
        }
        return !zeros ? 0 : sum2-sum1 ;
    }
}