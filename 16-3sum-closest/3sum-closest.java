import java.util.Arrays;

class Solution {

    public int threeSumClosest(int[] nums, int target) {

        // Step 1: Sort array
        Arrays.sort(nums);

        int n = nums.length;

        // Initialize closest sum
        int closest = nums[0] + nums[1] + nums[2];

        // Step 2: Fix one element
        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            // Step 3: Two pointer search
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Update closest sum
                if (Math.abs(target - sum) <
                    Math.abs(target - closest)) {

                    closest = sum;
                }

                // Exact match
                if (sum == target) {
                    return sum;
                }

                // Need bigger sum
                else if (sum < target) {
                    left++;
                }

                // Need smaller sum
                else {
                    right--;
                }
            }
        }

        return closest;
    }
}