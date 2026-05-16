class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
         ArrayList<Integer> list = new ArrayList<>();

           //sort each row and obtain the limited maximum elements 
          for(int i =0 ;i<grid.length;i++)
          {
                 Arrays.sort(grid[i]);

                 int count =0 ;

                 for(int j= grid[i].length -1 ;j>=0 && count<limits[i] ;j--) 
                 {
                    list.add(grid[i][j]);
                    count++ ;
                 }

          }

          //sort all  collected limited elements 

          Collections.sort(list,Collections.reverseOrder()) ;

           long sum =0 ;

           for(int i =0 ;i<k && i<list.size();i++ )
           {
            sum+= list.get(i);
           }
           return   sum ;
    }
}