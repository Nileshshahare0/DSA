class Solution {
    public int findMin(int[] nums) {
        sorteds(nums , 0 , nums.length-1);
        return nums[0];
    }
    public  void sorteds(int[]arr , int si , int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        sorteds(arr , si , mid);
        sorteds(arr , mid+1 , ei);
        merged(arr , mid , si , ei);
    }
    public void merged(int[]arr ,int mid , int si ,int ei){
        int[]temp = new int[ei - si + 1];
        int i = si;
        int j = mid +1;
        int k = 0;
        while(i <= mid && j<=ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        i = si;
        for(int n = 0 ; n<temp.length ; n++){
            arr[i++] = temp[n];
        }
    }
}