class Solution {
    public int subarraySum(int[] arr, int k) {
        int[]prefix = new int[arr.length];
        int sum = 0;
        for(int i = 0 ; i<arr.length ;i++){
            if(i==0){
                prefix[0] = arr[0];
            }else{
                prefix[i] = arr[i] + prefix[i-1];
            }
        }
        for(int i = 0; i<arr.length ; i++){
            for(int j = i ; j<prefix.length ; j++){
                int currentSum = i==0?prefix[j]: prefix[j] - prefix[i-1];
                if(currentSum == k){
                    sum++;
                }
            }
        }

        return sum;
        
    }
}