class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int largest = 0;
        for(int i =0; i< candies.length; i++)
        {
            if (candies[i] > largest)
            {
                largest = candies[i];
            }
        }

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