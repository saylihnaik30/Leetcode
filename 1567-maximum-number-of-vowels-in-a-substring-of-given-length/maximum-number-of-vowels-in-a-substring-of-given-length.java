class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int vowelCount = 0;
        for (int i = 0; i < k; i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        int maxVowels = vowelCount;
        for (int i = k; i < n; i++) {
            char ch = s.charAt(i - k);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount--;
            }
            char newChar = s.charAt(i);

            if (newChar == 'a' || newChar == 'e' || newChar == 'i' || newChar == 'o' || newChar == 'u') {
                vowelCount++;
            }
            maxVowels = Math.max(vowelCount, maxVowels);
        }

        return maxVowels;
    }
}