package io.github.abitgen.leetcode.challenge30.twenty20April._12_lastStoneWeight

import java.util.*


object LastStoneWeight {
    fun lastStoneWeight(A: IntArray): Int {
        val pq = PriorityQueue(Comparator { a: Int, b: Int -> b - a })
        for (a in A) pq.offer(a)
        while (pq.size > 1) pq.offer(pq.poll() - pq.poll())
        return pq.poll()
    }
}

fun main() {
    println(
        LastStoneWeight.lastStoneWeight(
            intArrayOf(
                2,
                7,
                4,
                1,
                8,
                1
            )
        )
    ) // 8,7,4,2,1,1 => 4,2,1,1,1 => 2,1,1,1 => 1,1,1 => 1
    println(LastStoneWeight.lastStoneWeight(intArrayOf(3, 7, 2))) // 7,3,2 => 4,2 => 2
    println(LastStoneWeight.lastStoneWeight(intArrayOf(7, 6, 7, 6, 9))) // 9,7,7,6,6 => 7,6,6,2 => 6,2,1 => 4,1 => 3
    println(LastStoneWeight.lastStoneWeight(intArrayOf(3, 7, 2, 4, 9))) // 9,7,4,3,2 => 4,3,2,2 => 2,2,1 => 1
    println(
        LastStoneWeight.lastStoneWeight(
            intArrayOf(
                448,
                714,
                34,
                990,
                892,
                711,
                755,
                851,
                522,
                353,
                509,
                870,
                520,
                549,
                805,
                990,
                783,
                990,
                727,
                716,
                421,
                857,
                766,
                156,
                770,
                22,
                609,
                498,
                467,
                957
            )
        )
    )
}