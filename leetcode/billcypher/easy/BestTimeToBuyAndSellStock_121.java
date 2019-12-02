package billcypher.easy;

public class BestTimeToBuyAndSellStock_121 {

    public static int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxSell = 0;
        int maxProfit = 0;
        for (int i=0; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                for (int d = i+1; d < prices.length; d++) {
                    if (maxSell < prices[d]) {
                        maxSell = prices[d];
                        minBuy = prices[i];
                        maxProfit = Math.max(maxProfit, maxSell - minBuy);
                    }
                }
            }
            maxSell = 0;
        }
        if (maxProfit > 0) return maxProfit;
        return 0;
    }

    // Better solution
//    public int maxProfit(int[] prices) {
//        int minprice = Integer.MAX_VALUE;
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minprice)
//                minprice = prices[i];
//            else if (prices[i] - minprice > maxprofit)
//                maxprofit = prices[i] - minprice;
//        }
//        return maxprofit;
//    }

}
