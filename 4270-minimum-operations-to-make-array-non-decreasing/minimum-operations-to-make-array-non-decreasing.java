class Solution {
    public long minOperations(int[] nums) {
        
        long answer = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < nums[i - 1]) {
                answer += nums[i - 1] - nums[i];
            }
        }

        return answer;
    }
}