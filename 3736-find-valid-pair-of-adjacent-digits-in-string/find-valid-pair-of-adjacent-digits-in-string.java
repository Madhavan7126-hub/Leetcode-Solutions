class Solution {
    public String findValidPair(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i =0 ;i<arr.length-1;i++)
        {
            Character l= arr[i];
            Character r= arr[i+1];

            if(l!=r && map.get(l)== Character.getNumericValue(l)&&  map.get(r)== Character.getNumericValue(r))
            {
                sb.append(l);
                sb.append(r);
                break ;
            }
        
        }
        return sb.toString();
    }
}