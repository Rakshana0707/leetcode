class Solution
{
    public int maxProfit(int[] prices)
    {
        int minPrice;
        int maxProfit;

        minPrice = prices[0];
        maxProfit = 0;

        for(int i=1;i<prices.length;i++)
        {
            int profit;

            profit = prices[i] - minPrice;

            if(profit > maxProfit)
            {
                maxProfit = profit;
            }

            if(prices[i] < minPrice)
            {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}