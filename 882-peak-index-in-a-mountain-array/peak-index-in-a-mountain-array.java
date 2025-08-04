class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length ;

        int start =0 ;
        int end = len -1;

        while(start<end)
     //start also searching the maximum element  like end so the answer will be at when start at end points out same element .
        {
             int  mid= start + (end -start)/2 ; 

             if(arr[mid]>arr[mid+1])
             {
                end = mid ;
             }
             if(arr[mid]<arr[mid+1]){
                start =mid+1 ;
             }


        }
        return end ;
    }
}