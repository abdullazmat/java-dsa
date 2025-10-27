class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums1 )
        {
            for (int i = 0; i < nums2.length; i++)
            {
                if (nums2[i] == num)
                {
                      numSet.add(num);
                }
            }
        }
        int[] nums = new int[numSet.size()];
        int i = 0;
        for (int n : numSet)
        {
            nums[i++] = n;
        }
        return nums;

    }
}