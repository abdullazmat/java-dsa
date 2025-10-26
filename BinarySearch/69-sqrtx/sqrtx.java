class Solution {
    public int mySqrt(int x) {
        
        int start = 0;
        int end = x;

        while(start <= end)
        {
            long mid = start + (end - start)/2;
            long sqrt = mid*mid;

            if (sqrt == x){
                return (int) mid;
            }
            else if (x > sqrt){
                start = (int) mid + 1;
            }
            else {
                end = (int) mid - 1;
            }
        }
        return end;
    }
}