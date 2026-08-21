class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            }
            else if(prices[i] - minValue > max){
                max = prices[i] - minValue;
            }
        }
        return max;
    }
}
