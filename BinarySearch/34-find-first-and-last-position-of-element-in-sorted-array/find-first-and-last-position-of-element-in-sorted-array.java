class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;
        int found = -1;

        while (start <= end)
        {
            int mid = start + (end - start)/2;

            if (target == nums[mid])
            {
                found = mid;
                break;
            }
            else if(target > nums[mid])
            {
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        int first = found;
        int last = found;
        while (first > 0 && nums[first - 1] == target )
        {
            first--;
        }
        while (last < nums.length - 1 && nums[last + 1] == target )
        {
            last++;
        }
        return new int[]{first,last};  
    }
}