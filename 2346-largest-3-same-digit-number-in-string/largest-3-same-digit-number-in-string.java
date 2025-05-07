class Solution {
    public String largestGoodInteger(String num) {
        int len =  num.length();
        int max = -1 ;
      
        for(int i =0 ;i<len-2;i++)
        {
            StringBuilder  sb = new StringBuilder();
            if(num.charAt(i)==num.charAt(i+1)&& num.charAt(i)==num.charAt(i+2) )
            {
                sb.append(num.charAt(i));
                sb.append(num.charAt(i+1));
                sb.append(num.charAt(i+2));
                max = Math.max(max,Integer.valueOf(sb.toString())) ;
            }
        }

        if(max==-1)
        {
            return "" ;
        }
        else if(max==0){
            return "000" ;
        }
            
            else{
            return String.valueOf(max);
        }
    }
}