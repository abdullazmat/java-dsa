class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
                for (int i = 0; i < 4; i++) {
            if (check_equal(mat, target))
                return true;
            mat = rotate_matrix(mat);
        }

        return false;
    }

        public static boolean check_equal(int[][] mat, int[][] target) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }

        return true;
    }


        public static int[][] rotate_matrix(int[][] mat) {

        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }
}