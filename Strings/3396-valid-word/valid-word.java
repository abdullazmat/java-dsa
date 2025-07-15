class Solution {
    public boolean isValid(String word) {
        int vowelCount = 0;
        int consonantCount = 0;

        if (word.length() < 3) return false;

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false; // only letters and digits allowed
            }

            if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        return vowelCount >= 1 && consonantCount >= 1;
    }
}
