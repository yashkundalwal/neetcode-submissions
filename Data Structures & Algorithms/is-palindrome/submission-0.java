class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s = s.trim();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        StringBuilder str = new StringBuilder(s);

        str = str.reverse();

        String str1 = str.toString();

        if(s.equals(str1))
        {
            return true;
        }

        return false;
    }
}
