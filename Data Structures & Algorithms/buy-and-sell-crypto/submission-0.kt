class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var minPrice = prices[0]
        var maxProfit = 0
        for(price in prices){//price 1
            if(price<minPrice){
                minPrice= price//1
            }
            else{
                maxProfit = maxOf(maxProfit,price-minPrice)//6
            }
        }
        return maxProfit

    }
}
