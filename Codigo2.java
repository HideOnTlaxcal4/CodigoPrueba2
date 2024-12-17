class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[128];
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right)]++; // Incrementa el conteo del carácter

            while (count[s.charAt(right)] > 1) { // Si hay duplicado
                count[s.charAt(left)]--; // Disminuye el conteo
                left++; // Mueve la ventana hacia la derecha
            }
        }

        return maxLength;
    }
}
