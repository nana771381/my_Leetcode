//You are given an array prices for which the ith element is the price of a given stock on day i.
// Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

// Runtime: 1 ms
// Memory Usage: 39 MB

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;         
        for(int i = 0; i < prices.length-1; i++)                 
            if(prices[i+1] - prices[i] > 0){             
                profit += prices[i+1] - prices[i];             
            }          
        return profit;
    }
}
