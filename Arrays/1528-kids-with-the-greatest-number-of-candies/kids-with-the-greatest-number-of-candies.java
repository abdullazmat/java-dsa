class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int largest = Arrays.stream(candies).max().getAsInt(); // O(n)

        for(int i =0; i< candies.length; i++)
        {
            if (candies[i] + extraCandies >= largest)
            {
                list.add(i,true);
            }
            else{
                list.add(i, false);
            }
        }

        return list;
    }
}