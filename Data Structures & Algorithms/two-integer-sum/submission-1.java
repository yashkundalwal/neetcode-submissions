class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int Arr[] = new int[2];
        int diff = 0;
        
        HashMap<Integer,Integer> hobj = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            diff = target - nums[i];

            if(hobj.containsKey(diff))
            {
                Arr[0] = hobj.get(diff);
                Arr[1] = i;
                return Arr;
            }

            hobj.put(nums[i],i);
        }

        return Arr;    
    }
}
