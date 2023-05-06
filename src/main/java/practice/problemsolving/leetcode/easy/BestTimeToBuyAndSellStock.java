package practice.problemsolving.leetcode.easy;

public class BestTimeToBuyAndSellStock {


    public int maxProfit2(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int buyPrice = prices[i];
            if (buyPrice < minPrice){
                minPrice = buyPrice;
            }
            else if ((buyPrice - minPrice) > maxProfit){
                maxProfit = buyPrice - minPrice;
            }
        }
        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int buyPrice = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                int sellPrice = prices[j];
                if ((sellPrice - buyPrice) > maxProfit){
                    maxProfit = sellPrice - buyPrice;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

    }
}
/**
 * link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&id=top-interview-150
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 *
 * Constraints:
 *
 * 1 <= prices.length <= 10^5
 * 0 <= prices[i] <= 10^4
 */
