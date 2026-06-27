class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]arr3 = new int[nums1.length+nums2.length];
        int n = 0,m = 0 , i = 0;
        while(i<arr3.length){
            while(nums1.length>n && nums2.length>m){
                if(nums1[n]<nums2[m]){
                    arr3[i++] = nums1[n++];
                }else{
                    arr3[i++] = nums2[m++];
                }
            }
            if(n<nums1.length){
                arr3[i] = nums1[n++];
            }
            if(m<nums2.length){
                arr3[i] = nums2[m++];
            }
            i++;
        }
        int mid = arr3.length/2;
        if(arr3.length % 2 != 0 ){
            return arr3[mid];
        }else{
            return (float)(arr3[mid]+arr3[mid-1]) /2 ;
        }
    }
}