class Solution {
     public int search(int[] arr, int target) {
        int pivot = findpivot(arr);
     //if there is no pivot just do normal binary search
        if(pivot==-1)
        {
            //apply normal binary search
            return binarySearch(arr, target,0,arr.length-1) ;
        }
        if(arr[pivot]==target)
        {
             return pivot ;
        }
        if(arr[0]<=target)
        {
            return binarySearch(arr,target, 0,pivot-1) ;
        }
        else{
            return binarySearch(arr,target, pivot+1,arr.length-1) ;
            
        }
    }

    static int binarySearch(int[]array, int target ,int start ,int end)
    {
         
        while(start<=end)
        {
         int mid = start +(end-start) /2 ;
            if(target<array[mid])
            {
                end=mid-1 ;
            }
            else  if(target>array[mid])
            {
                start=mid+1 ;
            }
            else{
                return mid ;
            }
        }
        return -1 ;
    }

        static  int findpivot(int[]arr)
        {
        int start =0 ;
        int end =arr.length-1;
        while(start<=end)
        {
            //fourcases over here 
        int mid = start + (end-start)/2 ;
            
         if( mid<end && arr[mid]>arr[mid+1])
              {
                return mid ;
              }

              if( mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
              }

              if(arr[start]> arr[mid])
              {
                end =  mid -1 ;
              }
              else{
                start=mid+1 ;
    
              } 
              
        }
        return -1 ;
    }
}