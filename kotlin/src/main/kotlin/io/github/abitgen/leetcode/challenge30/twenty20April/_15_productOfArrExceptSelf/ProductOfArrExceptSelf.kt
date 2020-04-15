package io.github.abitgen.leetcode.challenge30.twenty20April._15_productOfArrExceptSelf

object ProductOfArrExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {

        var l = 1
        val outArray = IntArray(nums.size)
        outArray[0] = l
        while (l < nums.size) {
            if (l != 0) outArray[l] = outArray[l - 1] * nums[l-1]
            l++
        }

        var r = nums.size - 1
        var tempRight = 1
        while (r >= 0) {
            if(r!=nums.size - 1) outArray[r] = tempRight * outArray[r]
            tempRight *= nums[r]
            r--
        }
        return outArray

    }
}

fun main() {
    println(ProductOfArrExceptSelf.productExceptSelf(intArrayOf(2,3,4,5)).joinToString())
}