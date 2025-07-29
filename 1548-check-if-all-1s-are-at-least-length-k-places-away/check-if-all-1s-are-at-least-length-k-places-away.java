class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int len = nums.length;
    ArrayList<Integer> li = new ArrayList<>();
    for(int i =0;i<len;i++)
    {
        if(nums[i]==1)
        {
            li.add(i);
        } 
    }

    for(int i=1;i< li.size();i++)
    {
        if((li.get(i)-li.get(i-1))-1 < k)
        {
            return false;
        }
    }
    return true ;

    }
}
