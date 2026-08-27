package ArrayStrings.Day26;

import java.lang.reflect.Array;

public class MaxProfit3 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int last = 0;
        int nextLast = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] >= prices[i]) {
                continue;
            }
            if (prices[i] - prices[i - 1] >= last || prices[i] - prices[i - 1] >= nextLast) {
                if (prices[i] - prices[i - 1] >= last) {
                    nextLast = last;
                    last = prices[i] - prices[i - 1];
                } else {
                    nextLast = prices[i] - prices[i - 1];
                }

            }
            if (prices[i] - prices[i - 1] == 1) {
                profit += 1;
            }
        }
        System.out.println(last + "" + nextLast);
        return Math.max(profit, last + nextLast);
    }

    public static void main(String[] args) {
        int arr[] = { 3,2,6,5,0,3};
    
        System.out.println(maxProfit(arr));
    }
}
