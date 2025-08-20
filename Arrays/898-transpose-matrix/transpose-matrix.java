class Solution {
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] trans_matrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans_matrix[j][i] = matrix[i][j];
            }
        }

        return trans_matrix;
    }
}