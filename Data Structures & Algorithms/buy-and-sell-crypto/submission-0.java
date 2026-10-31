class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int MaxPrice = 0;
        int Profit = 0;

        for(int i = 0 ; i < prices.length ; i++)
        {
            for(int j = i ; j < prices.length ; j++)
            {
                Profit = prices[j] - prices[i];
                MaxPrice = Math.max(Profit, MaxPrice);
            }
        }

        return MaxPrice;
        
    }
}
