class Solution {
    public int[] shuffle(int[] nums, int n) {
          int len = nums.length ;

          int[]arr = new int[len];

int i =0 ;
int j = len/2 ;
int k =0 ;
       while(i<len/2 && j<len)
       {
          arr[k]=nums[i] ;
          k++ ;
          arr[k]=nums[j];
          k++ ;
          i++ ;
          j++;
       }
 return arr ;
    }
}