class Solution {
    public int search(int[] nums, int target) {
       return findElement(nums,0,nums.length-1 ,target);
    }

     public int findElement(int[]arr , int left ,int right , int target){
        if(left>right){
            return -1;
        }
        int mid = (left + right)/2;
        if(arr[mid] == target)return mid;
        if(arr[mid] >=arr[left]){
            if(arr[mid] >=target && arr[left] <=target){
                return findElement(arr, left, mid-1, target);
            }else{
               return findElement(arr , mid+1 , right , target);
            }
        }else{
            if(arr[mid] <=target && arr[right] >=target){
               return findElement(arr, mid +1 , right, target);
            }else{
                return findElement(arr , left , mid-1 , target);
            }
        }
    }

}
