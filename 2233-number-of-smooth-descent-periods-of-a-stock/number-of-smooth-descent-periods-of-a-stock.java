class Solution {
    public long getDescentPeriods(int[] prices) {
        long answer = 0;
        long currLen = 0;

        for (int i = 0; i < prices.length; i++) {
            if (i > 0 && prices[i] == prices[i - 1] - 1) {
                currLen++;        // extend descent
            } else {
                currLen = 1;      // start new descent
            }
            answer += currLen;    // count all subarrays ending here
        }

        return answer;
    }
}
