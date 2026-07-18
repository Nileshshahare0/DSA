class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        int n = grid.length;
        int sum1 = 0;
        int totalSum = 0;
        for(int i = 0 ; i<=n*n ; i++){
            totalSum += i;
        }
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (seen.contains(grid[i][j])) {
                    arr[0] = grid[i][j];
                } else {
                    seen.add(grid[i][j]);
                }
                sum1 += grid[i][j];
            }
        }
        arr[1] = totalSum-(sum1 - arr[0]);
        return arr;

    }
}