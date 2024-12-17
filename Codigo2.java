class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[128];
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right)]++; // Incrementa el conteo del carácter
        }

        return maxLength;
    }
}
