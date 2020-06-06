package io.github.abitgen.leetcode.challenge30.twenty20April._7_countingElements

import kotlin.math.max
import kotlin.math.min

object CountingElements {
    fun countElements(arr: IntArray): Int {
        arr.sort()
        var consecutiveCount = 0
        val countMap = hashMapOf<Int, Int>()
        for (i in 0 until arr.size) {
            if (countMap[arr[i]] == null)
                countMap[arr[i]] = 1
            else
                countMap[arr[i]] = countMap[arr[i]]!! + 1
        }
        for (i in 0 until arr.size - 1) {
            if (arr[i] + 1 == arr[i + 1]) {
                if (countMap[arr[i]]!! > 1) {
                    consecutiveCount += if(countMap[arr[i]]!! > countMap[arr[i] + 1]!!) max(countMap[arr[i]]!!, countMap[arr[i] + 1]!!)
                                        else min(countMap[arr[i]]!!, countMap[arr[i] + 1]!!)
                } else
                    consecutiveCount++
            }
        }
            return consecutiveCount
    }

    fun countElements2(arr: IntArray): Int {
        arr.sort()
        var consecutiveCount = 0
        val countMap = hashMapOf<Int, Int>()
        for (i in 0 until arr.size) {
            if (countMap[arr[i]] == null)
                countMap[arr[i]] = 1
            else
                countMap[arr[i]] = countMap[arr[i]]!! + 1
        }
        countMap.forEach { k, v ->
            if(countMap[k+1] == null)
                return@forEach
            else
                consecutiveCount += countMap[k] ?: 0
        }

        return consecutiveCount
    }
}

fun main() {
    //CountingElements.countElements(intArrayOf(1, 1, 2, 2, 2, 3, 2, 3, 3, 5, 6, 0))
    CountingElements.countElements2(intArrayOf(13,12,9,4,16,7,3,13,14,12,11,4,1,4,9,13,3)) // sorted - 1, 3, 3, 4, 4, 4, 7, 9, 9, 11, 12, 12, 13, 13, 13, 14, 16// 8
    CountingElements.countElements2(intArrayOf(1,1,2,2,2,2,3,3,3,4,4))
    CountingElements.countElements(intArrayOf(1,1,2,2,3))
    //CountingElements.countElements(intArrayOf(1,1,1,2,2,3))


}