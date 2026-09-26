class Solution {
    public int trap(int[] height) {
        int waterLevel = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        right[height.length-1] = height[height.length-1];
        for(int i = 1 ; i<height.length ; i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        for(int j = height.length-2 ; j>=0 ; j--){
            right[j] = Math.max(height[j],right[j+1]);
        }
        for(int i = 0; i<height.length ; i++){
            waterLevel += Math.min(left[i],right[i])-height[i];
        }
        return waterLevel;
    }
}