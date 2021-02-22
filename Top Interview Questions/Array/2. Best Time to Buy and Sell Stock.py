# You are given an array prices for which the ith element is the price of a given stock on day i.
# Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
# Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).


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
