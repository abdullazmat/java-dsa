class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] final_arr = new int[image.length][image[0].length];

        int row_index = 0;
        for (int[] arr : image) {

            int[] temp = new int[arr.length];
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == 0) {
                    temp[arr.length - 1 - i] = 1;
                } else {
                    temp[arr.length - 1 - i] = 0;
                }

            }
            final_arr[row_index] = temp;
            row_index++;

        }

        return final_arr;
    }
}