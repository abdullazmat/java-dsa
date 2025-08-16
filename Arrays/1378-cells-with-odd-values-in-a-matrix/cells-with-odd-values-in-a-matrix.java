class Solution {
    public int oddCells(int m, int n, int[][] indices) {
                int[][] null_matrix = new int[m][n];
        int odd_num_count = 0;

        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];

            for (int i = 0; i < null_matrix[row].length; i++) {
                null_matrix[row][i] += 1;
            }
            for (int j = 0; j < null_matrix.length; j++) {
                null_matrix[j][col] += 1;
            }

        }

        for (int i = 0; i < null_matrix.length; i++) {
            for (int j = 0; j < null_matrix[i].length; j++) {
                if (null_matrix[i][j] % 2 != 0) {
                    odd_num_count += 1;
                }
            }
        }

        return odd_num_count;
    }
}