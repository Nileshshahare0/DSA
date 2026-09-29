class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>s = new Stack<>();
        for(int i = nums.length-1 ; i>=0 ; i--){
            s.push(nums[i]);
        }
        for(int i = nums.length-1 ; i>=0 ; i--){
            int curr = nums[i];
            while(!s.isEmpty() && s.peek() <= curr){
                s.pop();
            }
            if(s.isEmpty()){
                nums[i] = -1;
            }else{
                nums[i] = s.peek();
            }
            s.push(curr);
        }
        return nums;
    }
}