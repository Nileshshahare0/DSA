class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
       int[] arr1 = new int[1001];
       for(int X : target){
        arr1[X]++;
       }
       for(int Y : arr){
        arr1[Y]--;
       }
       for(int num : arr1){
        if( num != 0)return false;
       }
       return true;
    }
}