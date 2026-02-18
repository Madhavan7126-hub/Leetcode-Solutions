class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
          int len = image[0].length ;
         int[][]arr = new int[image.length][len] ;
          for(int i =0 ;i<image.length;i++)
          {
            int ind =0 ;
            for(int j = len-1 ;j>=0;j--)
            {
               arr[i][ind]= image[i][j]; 
               ind++ ;
            }
          }

           for(int k =0 ;k<arr.length;k++)
          {
               for(int l = 0 ;l<arr[0].length;l++)
               {
                       if(arr[k][l]==0)
                       {
                           arr[k][l]=1 ;
                       }
                       else{
                        arr[k][l]=0 ;
                       }
               }
          }

          return arr ; 
    }
}