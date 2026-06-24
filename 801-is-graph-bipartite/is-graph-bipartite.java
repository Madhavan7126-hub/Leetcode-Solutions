class Solution {
    public boolean isBipartite(int[][] graph) {

         int v = graph.length ;
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
    for(int i =0 ;i<graph.length;i++)
        {

            li.add(new ArrayList<>());
            for(int j =0 ;j<graph[i].length;j++)
            {
                  li.get(i).add(graph[i][j]);
            }
        }

    int[] coloured = new int[v] ;
    for(int i =0 ;i<v;i++)
    {
        coloured[i]=-1 ;
    }

    for(int i =0 ;i<v;i++)
    {
        if(coloured[i]==-1)
        {
            if( !check(i,v,li,coloured)) 
            {
                return false ;
            }
        }

    }
   return true ;

    }


     public boolean check(int s ,int v , ArrayList<ArrayList<Integer>> adj,int[]col)
     {
          Queue<Integer> q = new LinkedList<>();

          q.offer(s);
          col[s]=0 ;

          while(!q.isEmpty())
          {
            int curr = q.poll();
     

            for(int i : adj.get(curr))
            {
                if(col[i]==-1)
                {
                    col[i]=1-col[curr] ;
                    q.offer(i);
                }

                if(col[i]==col[curr])
                {
                    return false ;
                }
            }

          
          }
       return true ;

     }
}