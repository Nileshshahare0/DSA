import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0] ,sell = 0 , profit = 0 ;
        for(int i = 0 ; i<prices.length ; i++){
            sell = prices[i];
            profit = Math.max(profit,sell-buy);
            buy = Math.min(buy,prices[i]);
        }
        return profit;
    }
}