package ArrayStrings.Day25;

public class BestTimetoBuyStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1;i< prices.length;i++){
            if(prices[i - 1] >= prices[i] ){
                continue;
            }
            profit += prices[i] - prices[i - 1];
        }
        return profit;
    }

}
