class Solution {
    public int maxProfit(int[] prices) {
        int firstbuy = Integer.MAX_VALUE;
        int firstprofit = 0;
        int secondbuy = Integer.MAX_VALUE;
        int secondprofit = 0;

        for(int price : prices){
            firstbuy = Math.min(firstbuy, price);

            firstprofit = Math.max(firstprofit, price - firstbuy);

            secondbuy = Math.min(secondbuy, price - firstprofit);

            secondprofit = Math.max(secondprofit, price - secondbuy);
        }
        return secondprofit;
    }
}