class Solution 
{
    public int[] twoSum(int[] numbers, int target)
    {
        int Ans = 0;
        int i = 0;
        int j = 0;

        int start = 0;
        int end = numbers.length - 1;
        int Arr[] = new int[2];

        while(start < end)
        {
            if((numbers[start] + numbers[end]) == target)
            {
                Arr[0] = start+1;
                Arr[1] = end+1;
                break;
            }
            else if((numbers[start] + numbers[end]) < target)
            {
                start++;
            }
            else if((numbers[start] + numbers[end]) > target)
            {
                end--;
            }
        }

        return Arr;

    }
}
