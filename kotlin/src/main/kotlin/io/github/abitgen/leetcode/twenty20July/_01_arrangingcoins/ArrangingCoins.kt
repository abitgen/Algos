package io.github.abitgen.leetcode.twenty20July._01_arrangingcoins

import kotlin.math.floor
import kotlin.math.sqrt

object ArrangingCoins {
    fun arrangeCoins(n: Int): Int {
        var lastStep = 0;
        val start = findLastStep(n)
        var i = start
        while (calculateMaxTotalSteps(i) <= n) {
            lastStep = i
            i++;
        }
        return lastStep
    }

    fun findLastStep(n: Int): Int {
        var mid = n / 2 - 1
        while (calculateMaxTotalSteps(mid) > n) {
            mid = 2 * sqrt(mid.toDouble()).toInt()
        }
        return mid
    }

    fun calculateMaxTotalSteps(i: Int): Long {
        return (((i.toLong() * i) + i) / 2)
    }

    // More info - https://leetcode.com/articles/arranging-coins/
    fun arrangeCoins2(n: Int): Int {
        return floor((sqrt((1L + 8L*n.toLong()).toDouble()) - 1.0) / 2.0).toInt()
    }
}

fun main() {
    println(ArrangingCoins.arrangeCoins(1804289383)) //60070
    println(ArrangingCoins.arrangeCoins(8)) //3
    println(ArrangingCoins.arrangeCoins(5)) //2
    println(ArrangingCoins.arrangeCoins(1714636915)) // 58559
}