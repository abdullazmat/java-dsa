class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1;
        int row = -1;

        // find row whose first element <= target (largest such row)
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid][0] == target) return true;
            else if (matrix[mid][0] < target) {
                row = mid;          
                low = mid + 1;
            } else {
                high = mid - 1;     
            }
        }

        if (row == -1) return false;   // target smaller than first element of matrix

        return findInRow(matrix[row], target);
    }

    private boolean findInRow(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) return true;
            else if (arr[mid] < x) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
