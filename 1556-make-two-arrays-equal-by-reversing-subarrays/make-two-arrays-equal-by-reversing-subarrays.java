class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
       int[] arr1 = new int[1001];
       for(int i = 0 ; i<target.length ; i++){
        int a = target[i];
        arr1[a]++;
        int b = arr[i];
        arr1[b]--;
       }
       for(int num : arr1){
        if( num != 0)return false;
       }
       return true;
    }
}