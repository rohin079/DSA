package Arrays;

public class BuyAndSellStock {
    public static int timeToBuyStock(int prices[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }

            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
        }

        return maxProfit;

    };

    public static void main(String[] args) {

        int prices[] = { 2, 5, 7, 0, 3, 8, 3 };

        System.out.println(timeToBuyStock(prices));

    }
}
