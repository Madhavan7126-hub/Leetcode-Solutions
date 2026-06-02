import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {

        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i = 0;
        int n = events.length;
        int day = 0;
        int attended = 0;

        while (i < n || !minHeap.isEmpty()) {

            // If heap is empty, jump to next event's start day
            if (minHeap.isEmpty()) {
                day = events[i][0];
            }

            // Add all events that start today
            while (i < n && events[i][0] <= day) {
                minHeap.offer(events[i][1]);
                i++;
            }

            // Remove expired events
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            // Attend one event
            if (!minHeap.isEmpty()) {
                minHeap.poll();
                attended++;
            }

            day++;
        }

        return attended;
    }
}