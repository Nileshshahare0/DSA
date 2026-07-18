class Solution {
     public static void setZeroes(int[][] matrix) {
        boolean[]row = new boolean[matrix.length];
        boolean[]colm = new boolean[matrix[0].length];
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    colm[j] = true;
                }
            }
        }
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                if (row[i] || colm[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
     }
}