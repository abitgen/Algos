package io.github.abitgen.leetcode.challenge30.twenty20June._03_twoCityScheduling

import java.util.*

object TwoCityScheduling {
    /**
     * Runtime: 164 ms, faster than 73.33% of Kotlin online submissions for Two City Scheduling.
     * Memory Usage: 33.9 MB, less than 100.00% of Kotlin online submissions for Two City Scheduling.
     *
     */
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        val halfCount = costs.size / 2
        val pq = PriorityQueue(compareBy<IntArray> {
            it[0] - it[1]
        })

        costs.forEach { pq.offer(it) }

        var res = 0
        while (pq.isNotEmpty()) {
            res += if (pq.size > halfCount) pq.poll()[0] else pq.poll()[1]
        }

        return res
    }

    /**
     *
     * Runtime: 176 ms, faster than 66.67% of Kotlin online submissions for Two City Scheduling.
     * Memory Usage: 35.5 MB, less than 100.00% of Kotlin online submissions for Two City Scheduling.
     *
     */
    fun twoCitySchedCost2(costs: Array<IntArray>): Int {

        val halfCount = costs.size / 2
        val cityBdiffList = costs.mapIndexed { index, value ->  value[1] - value[0] }.sorted()
        val cityATotalSum = costs.sumBy { it[0] }
        var cityBRefund = 0

        var toCount = 0
        while(toCount < halfCount){
            cityBRefund += cityBdiffList[toCount]
            toCount++
        }

        return cityATotalSum + cityBRefund
    }
}

fun main() {
    println(
        TwoCityScheduling.twoCitySchedCost(
            arrayOf(
                intArrayOf(10, 20),
                intArrayOf(30, 200),
                intArrayOf(400, 50),
                intArrayOf(30, 20)
            )
        )
    ) //110

    println(
        TwoCityScheduling.twoCitySchedCost(
            arrayOf(
                intArrayOf(259, 770),
                intArrayOf(448, 54),
                intArrayOf(926, 667),
                intArrayOf(184, 139),
                intArrayOf(840, 118),
                intArrayOf(577, 469)
            )
        )
    ) //1859

    val costs = arrayOf(
        intArrayOf(518, 518),
        intArrayOf(71, 971),
        intArrayOf(121, 862),
        intArrayOf(967, 607),
        intArrayOf(138, 754),
        intArrayOf(513, 337),
        intArrayOf(499, 873),
        intArrayOf(337, 387),
        intArrayOf(647, 917),
        intArrayOf(76, 417)
    )
    println(
        TwoCityScheduling.twoCitySchedCost(
            costs
        )
    ) //3671

    println(
        TwoCityScheduling.twoCitySchedCost2(
            costs
        )
    ) //3671
}