import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {

        int maxFreq = 0;
        int left = 0;
        int right = 0;
        int maxLength = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while ((right - left + 1) - maxFreq > k) {

                char c = s.charAt(left);

                map.put(c, map.get(c) - 1);

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

            right++;
        }

        return maxLength;
    }
}