package leetcode;

public class BestTimeToBuyAndSellStock2_122 {

    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int sumProfit = 0;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            else if (prices[i] > minprice){
                if (prices[i] - minprice > maxprofit) maxprofit = prices[i] - minprice;
                sumProfit += maxprofit;
                maxprofit = 0;
                minprice = prices[i];
            }
            else if (prices[i] - minprice > maxprofit){
                maxprofit = prices[i] - minprice;
            }
        }
        if (sumProfit > 0) return sumProfit;
        return maxprofit;
    }

}
