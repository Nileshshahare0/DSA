class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int max = 0;
        for(int nums : nums2){
            max = Math.max(max , nums);
        }
        int[]map = new int[max+1];
        Stack<Integer>s = new Stack<>();
        for(int i = nums2.length-1 ; i>=0 ; i--){
            int num = nums2[i];
            while(!s.isEmpty() && nums2[s.peek()]<num){
                s.pop();
            }
            if(s.isEmpty()){
                map[num] = -1;
            }else{
                map[num] = nums2[s.peek()];
            }
            s.push(i);
        }
        for(int i = 0 ; i<nums1.length ; i++){
            nums1[i] = map[nums1[i]];
        }
        return nums1;
    }
}