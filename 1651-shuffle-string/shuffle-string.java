class Solution {
    public String restoreString(String s, int[] indices) {
        int len = indices.length;

        char[] arr = new char[len];
          int i =0 ;
        while(i<len)
        {
            int j = indices[i];
            arr[j] =s.charAt(i);
            i++;
        }

        StringBuilder sb = new StringBuilder() ;

        for(int j =0;j<len;j++)
        {
            sb.append(arr[j]) ;
        }

        return sb.toString();
    }
}