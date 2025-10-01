public class BuySellStock {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            // If the current price is a new minimum, update our buying price
            if (price < minPrice) {
                minPrice = price;
            } 
            // Otherwise, check if selling today gives a better profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        
        return maxProfit;
    }
}

