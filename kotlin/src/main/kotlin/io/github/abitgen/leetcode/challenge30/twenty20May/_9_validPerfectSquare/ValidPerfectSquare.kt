package io.github.abitgen.leetcode.challenge30.twenty20May._9_validPerfectSquare

import kotlin.math.pow

object ValidPerfectSquare {

    /**
     * My Solution - Leetcode time - 130ms
     */
    fun isPerfectSquare(num: Int): Boolean {
        var end = kotlin.math.max(num,100)
        var start = 1
        var mid = 0

        if (num == 1) return true

        while (start <= end) {
            mid = (start + end) / 2

            if (start == mid) {
                println("$start $mid $end")
                return false
            }

            var midSquare: Long = mid.toLong() * mid

            if (midSquare == num.toLong()) {
                println("$start $mid $end")
                return true
            }

            if (midSquare > num) {
                end = mid
            } else if (midSquare < num) {
                start = mid
            }
        }
        return false
    }

    /**
     * Other Solution - Leetcode time - 100ms
     */
    fun isPerfectSquare2(num: Int): Boolean {
        var res = num.toLong()
        while (res * res > num) {
            res = (res + num / res) / 2
        }

        return res * res == num.toLong()
    }
}

fun main() {
    println(ValidPerfectSquare.isPerfectSquare(2147395600)) // true
    println(ValidPerfectSquare.isPerfectSquare2(808201)) // true
    println(ValidPerfectSquare.isPerfectSquare2(4)) // true
}


/**
 *
 * Extra notes:
 *
 * Sum of n Odd numbers will always be a square number of n^2
 *
 * Or Sum of 1..n + Sum of 1..(n-1) is also n^2
 *
 * So can be calculated using math formula
 *
 * Sum of n = n(n+1)/2
 *
 */