package io.github.abitgen.leetcode.challenge30.twenty20April._5_best_buysell_stock_2

object BestBuySellStock2 {
        fun maxProfit(prices: IntArray): Int {
            var maxprofit = 0;
            for (i in 1 until  prices.size) {
                if (prices[i] > prices[i - 1])
                    maxprofit += prices[i] - prices[i - 1];
            }
            return maxprofit;
        }
}

fun main(){
    println(BestBuySellStock2.maxProfit(intArrayOf(7,1,5,3,2,4,10,6,4,5)))
}
