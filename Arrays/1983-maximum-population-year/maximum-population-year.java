class Solution {
    public int maximumPopulation(int[][] logs) {
        int max_pop = 0;
        int current_pop = 0;
        int earliest_year = 1950;
        int last_year = 2051;
        int[] years = new int[last_year];

        for(int[] log : logs ){
           years[log[0]]++;
           years[log[1]]--;
        }

        for(int i =earliest_year; i<last_year; i++)
        {
            current_pop += years[i];
            if( max_pop < current_pop )
            {
              max_pop = current_pop;
              earliest_year = i;   
            }
        }


        return earliest_year;
    }
}