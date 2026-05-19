class Solution {

    public int maxFreq(String s,
                       int maxLetters,
                       int minSize,
                       int maxSize) {

        HashMap<String, Integer> map = new HashMap<>();

        HashMap<Character, Integer> count = new HashMap<>();

        int left = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            count.put(ch,
                      count.getOrDefault(ch, 0) + 1);

            // maintain window size = minSize
            if(right - left + 1 > minSize) {

                char leftChar = s.charAt(left);

                count.put(leftChar,
                          count.get(leftChar) - 1);

                if(count.get(leftChar) == 0) {
                    count.remove(leftChar);
                }

                left++;
            }

            // valid window
            if(right - left + 1 == minSize &&
               count.size() <= maxLetters) {

                String sub = s.substring(left, right + 1);

                map.put(sub,
                        map.getOrDefault(sub, 0) + 1);

                max = Math.max(max, map.get(sub));
            }
        }

        return max;
    }
}