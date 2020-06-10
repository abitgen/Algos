package io.github.abitgen.leetcode.challenge30._10_searchInsertPosition

import java.util.*

object SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val result = Arrays.binarySearch(nums, target)
        return if(result < 0)
                    kotlin.math.abs(result) - 1
               else result
    }
}

fun main(){
    println(SearchInsertPosition.searchInsert(intArrayOf(1,3,5,6), 2))
}