package io.github.abitgen.leetcode.challenge30.twenty20April._28_findUniqueNumber

import kotlin.collections.LinkedHashMap

/**
 * My solution leetcode time - 1156ms
 */
class FindUniqueNumber(val nums: IntArray) {

    val linkedMap = LinkedHashMap<Int, Boolean>()
    val linkedSet = LinkedHashSet<Int>()
    val first:Int = 0

    init {
        for (i in nums) {
            add(i)
        }
    }

    fun showFirstUnique(): Int {
        println(if (linkedSet.size == 0) -1 else linkedSet.first())
        return if (linkedSet.size == 0) -1 else linkedSet.first()
    }

    fun add(value: Int) {
        if (linkedMap[value] == true) {
            linkedMap[value] = false
            linkedSet.remove(value)
        }
        else if (linkedMap[value] == null) {
            linkedMap[value] = true
            linkedSet.add(value)
        }
    }
}

fun main() {
    val firstUnique = FindUniqueNumber(intArrayOf(2, 3, 5))
    firstUnique.showFirstUnique(); // return 2
    firstUnique.add(5);            // the queue is now [2,3,5,5]
    firstUnique.showFirstUnique(); // return 2
    firstUnique.add(2);            // the queue is now [2,3,5,5,2]
    firstUnique.showFirstUnique(); // return 3
    firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
    firstUnique.showFirstUnique(); // return -1
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
}