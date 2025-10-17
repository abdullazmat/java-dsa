class Solution {
    public int search(int[] nums, int target) {
        int bottom = findBottom(nums);

        // search left part (0..bottom-1)
        int left = findInAsc(nums, 0, bottom - 1, target, true);
        if (left != -1) return left;

        // search right part (bottom..n-1)
        return findInAsc(nums, bottom, nums.length - 1, target, true);
    }

    // find index of smallest element (rotation point / "bottom")
    private int findBottom(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int start = 0;
        int end = n - 1;

        // standard O(log n) approach for rotated sorted array
        while (start < end) {
            int mid = start + (end - start) / 2;
            // if mid value > end value, min is to the right
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // index of minimum
    }

    // binary search on range [s..e]; asc=true -> ascending order search
    private int findInAsc(int[] nums, int s, int e, int t, boolean asc) {
        int start = s;
        int end = e;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == t) return mid;

            if (asc) {
                if (nums[mid] > t) end = mid - 1;
                else start = mid + 1;
            } else {
                // kept for completeness if you want to search descending segments
                if (nums[mid] > t) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
