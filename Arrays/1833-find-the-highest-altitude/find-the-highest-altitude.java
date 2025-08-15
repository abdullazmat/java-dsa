class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int[] altitudes_diff = new int[gain.length];

        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];
            altitudes_diff[i] = altitude;
        }

        return check_highest_altitudes(altitudes_diff);
    }

        public static int check_highest_altitudes(int[] arr) {
        int highest_altitude = 0;
        for (int i : arr) {
            if (i > highest_altitude) {
                highest_altitude = i;
            }
        }
        return highest_altitude;

    }
}