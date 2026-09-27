class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]nextgreater = new int[nums2.length];
        int[]ans = new int[nums1.length];
        Stack<Integer>s = new Stack<>();
        for(int i = nums2.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && nums2[s.peek()]<nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i] = -1;
            }else{
                nextgreater[i] = nums2[s.peek()];
            }
            s.push(i);
        }

        for(int i = 0 ; i<nums1.length ; i++){
            int j = 0;
            while(nums1[i] != nums2[j]){
                j++;
            }
            ans[i] = nextgreater[j];
        }
        return ans;
    }
}