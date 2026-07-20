class Solution {
   public static int peakIndexInMountainArray(int[] arr) {
        if(arr.length == 1) return arr[0];
        int i = 0 ;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            int first = (mid - 1) == -1 ? mid : (mid-1);
            int second = (mid +1) == arr.length ? mid : (mid+1);
            if((arr[mid] >  arr[first] && arr[mid]> arr[second]) || i == j ){
                return mid;
            }else if(arr[mid] < arr[second]){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return -1;
    }
}