class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ansList = new ArrayList<>();
        
        for(int i = 0; i<index.length; i++)
        {
            ansList.add(index[i], nums[i]);
        }
        int[] result = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            result[i] = ansList.get(i);
        }
        return result;
    }
}