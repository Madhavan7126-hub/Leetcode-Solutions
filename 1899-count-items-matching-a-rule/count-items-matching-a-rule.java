class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ref =0 ; 
        int count =0 ;
        if(ruleKey.equals("color"))
        {
             ref =1 ;
        }
        else if(ruleKey.equals("name"))
        {
            ref = 2 ;
        }
        else{
            ref=0 ;
        }

        int i =0 ;
        int j =0 ;
        int len = items.size(); 
        while(i<len )
        {
            if(items.get(i).get(ref).equals(ruleValue))
            {
                count++; 
            }
            i++ ;
        }

        return count ;
    }
}