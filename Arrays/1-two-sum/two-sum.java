class Solution {
    public int[] twoSum(int[] nums, int target) {
                int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int f_index = nums[i];

            for (int j = 0; j < nums.length; j++) {
                int s_index = nums[j];

                if (i != j && f_index + s_index == target) {
                    indices[0] = i;
                    indices[1] = j;

                    return indices;

                }
            }

        }

        return indices;
    }
}