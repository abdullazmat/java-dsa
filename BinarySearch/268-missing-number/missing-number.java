class Solution {
    public int missingNumber(int[] nums) {
        for (int num = 0; num <= nums.length; num++) {
            boolean found = false; // reset for each num

            for (int val : nums) {
                if (val == num) {
                    found = true;
                    break;
                }
            }

            if (!found) return num; // if not found in the array, it's missing
        }

        return -1; // fallback (should never reach here)
    }
}
