class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List> map = new HashMap<>();

        for(String s : strs)
        {
            char Arr[] = s.toCharArray();

            Arrays.sort(Arr);

            String key = new String(Arr);

            if(map.containsKey(key) == false)
            {
                map.put(key, new ArrayList<String>());
            }

            map.get(key).add(s);
        }

        return new ArrayList(map.values());
    }
}
