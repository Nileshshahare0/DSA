class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2)return 0;
        Arrays.sort(nums);
        int max =0;
        int i = 0 , j = 1;
        while(i<nums.length - 1 && j< nums.length){
            int num = nums[j] - nums[i];
            max = Integer.max(num,max);
            i++;
            j++;
        } 
        return max;     
    }
}