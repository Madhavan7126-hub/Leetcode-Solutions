class Solution {
    public int totalFruit(int[] fruits) {
            HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit into basket
            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);

            // If more than 2 fruit types
            while (map.size() > 2) {

                // Remove left fruit count
                map.put(fruits[left],
                        map.get(fruits[left]) - 1);

                // Remove fruit completely if count becomes 0
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            // Update maximum window size
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}