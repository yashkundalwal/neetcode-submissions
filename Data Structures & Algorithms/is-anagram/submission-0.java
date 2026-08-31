class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char Arr[] = s.toCharArray();
        char Brr[] = t.toCharArray();

        if(Arr.length != Brr.length)
        {
            return false;
        }

        Arrays.sort(Arr);
        Arrays.sort(Brr);

        for(int i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] != Brr[i])
            {
                return false;
            }
        }

        return true;
    }
}
