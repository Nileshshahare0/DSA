class Solution {
    public int[] sortArray(int[] nums) {
        sorteds(nums , 0 , nums.length-1);
        return nums;
    }
    public void sorteds(int[] arr , int si , int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        sorteds(arr, si, mid);
        sorteds(arr , mid+1 , ei);
        merge(arr , mid , si , ei);
    }
    public void merge(int[]arr , int mid , int si , int ei){
        int[]num  = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j<=ei){
            if(arr[i]<arr[j]){
                num[k] = arr[i];
                i++;
            }else{
                num[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            num[k++] = arr[i++];
        }
        while(j<=ei){
            num[k++] = arr[j++];
        }
        i =  si;
        for(int n = 0 ; n<num.length ; n++){
            arr[i] = num[n];
            i++;
        }
    }
}