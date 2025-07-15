class Solution {
    public int[] buildArray(int[] nums) {
        int[] index = new int[nums.length];
        int[] ans = new int[nums.length];
        for(int i =0; i < nums.length; i++ )
        {
            index[i] = nums[i];
            ans[i] = nums[index[i]];

        }


        return ans;
    }
}