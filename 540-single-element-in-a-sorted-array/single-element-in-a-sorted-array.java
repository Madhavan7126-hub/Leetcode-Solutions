class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure mid is even (start of a pair)
            if (mid % 2 == 1) {
                mid--;
            }

            // If pair matches, unique element is to the right
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                // Pair is broken, unique is at mid or to the left
                right = mid;
            }
        }

        // When left == right, we found the single element
        return nums[left];
    }
}
