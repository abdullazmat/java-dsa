/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndex(mountainArr);

        int left = binarySearch(mountainArr, target, 0, peak, true);
        if (left != -1) return left; // found

        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int findPeakIndex(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid; 
            } else {
                start = mid + 1; 
            }
        }
        return start; 
    }

    private int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mountainArr.get(mid);

            if (val == target) return mid;

            if (asc) { 
                if (val < target) start = mid + 1;
                else end = mid - 1;
            } else {   
                if (val > target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
