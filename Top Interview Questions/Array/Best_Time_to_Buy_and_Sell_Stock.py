# wrote in java, not accepted, so changed to python instead
# Runtime: 64 ms
# Memory Usage: 15 MB

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0;
        
        for i in range(len(prices)-1):
            price_diff = prices[i+1] - prices[i];
            
            if price_diff > 0:
                profit += price_diff
        
        return profit
