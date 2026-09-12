class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int minBuy = prices[0];
        for (int sell : prices){
            int pro = sell - minBuy;
            maxPro = Math.max(maxPro, pro);
            minBuy = Math.min(minBuy, sell);
        }
        return maxPro;
    }
}
