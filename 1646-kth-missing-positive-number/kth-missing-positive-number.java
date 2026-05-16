class Solution {

    public int findKthPositive(int[] arr, int k) {

        int miss = 0;
        int count = 0;
        int num = 1;

        while (true) {

            if (count < arr.length && arr[count] == num) {

                count++;
            }
            else {

                miss++;

                if (miss == k) {
                    return num;
                }
            }

            num++;
        }
    }
}