class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> hobj = new HashMap<Integer, Integer>();

        for(int i : nums)
        {
            if(hobj.containsKey(i))
            {
                return true;
            }
            else
            {
                hobj.put(i,1);
            }
        }

        return false;
    }
}