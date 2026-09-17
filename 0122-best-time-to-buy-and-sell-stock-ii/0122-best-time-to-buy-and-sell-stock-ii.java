class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int totalprofit = 0;

        while(right < prices.length){
            if(prices[left] < prices[right]){
                totalprofit += prices[right] - prices[left];
            }
            left = right;
            right++;
        }
        return totalprofit;
    }
}