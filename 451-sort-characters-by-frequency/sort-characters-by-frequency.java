import java.util.*;

class Solution {

    public String frequencySort(String s) {

        // Step 1: Count frequencies
        HashMap<Character, Integer> map = new HashMap<>();
               
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<Character> maxHeap =
            new PriorityQueue<>(
                (a, b) -> map.get(b) - map.get(a)
            );

        maxHeap.addAll(map.keySet());

        // Step 3: Build answer
        StringBuilder sb = new StringBuilder();

        while(!maxHeap.isEmpty()) {

            char ch = maxHeap.poll();

            int freq = map.get(ch);

            for(int i = 0; i < freq; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}