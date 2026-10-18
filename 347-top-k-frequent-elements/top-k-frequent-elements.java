import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;

        // Step 1: Count frequency
        while (i < nums.length) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            i++;
        }

        // Step 2: Create Min Heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for (int num : map.keySet()) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 3: Store the k most frequent elements
        int[] result = new int[k];
        i = 0;

        while (!pq.isEmpty()) {
            result[i] = pq.poll();
            i++;
        }

        return result;
    }
}