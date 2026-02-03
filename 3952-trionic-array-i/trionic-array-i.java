class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

       
        for (int p = 1; p < n - 2; p++) {
            
            boolean inc1 = true;
            for (int i = 1; i <= p; i++) {
                if (nums[i] <= nums[i - 1]) {
                    inc1 = false;
                    break;
                }
            }
            if (!inc1) continue;

            
            for (int q = p + 1; q < n - 1; q++) {
                
                boolean dec = true;
                for (int i = p + 1; i <= q; i++) {
                    if (nums[i] >= nums[i - 1]) {
                        dec = false;
                        break;
                    }
                }
                if (!dec) continue;

               
                boolean inc2 = true;
                for (int i = q + 1; i < n; i++) {
                    if (nums[i] <= nums[i - 1]) {
                        inc2 = false;
                        break;
                    }
                }

                if (inc2) return true;
            }
        }

        return false;
    }
}
