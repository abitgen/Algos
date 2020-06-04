package io.github.abitgen.leetcode.challenge30.twenty20June._03_twoCityScheduling

import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

object TwoCityScheduling {
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        val halfCount = costs.size / 2
        val pq = PriorityQueue(compareBy<IntArray> {
            it[0] - it[1]
        })

        costs.forEach { pq.offer(it) }

        while(pq.isNotEmpty()){
            println(pq.poll().joinToString())
        }

        var res = 0
        while (pq.isNotEmpty()) {
            res += if (pq.size > halfCount) pq.poll()[0] else pq.poll()[1]
        }

        return res
    }
}

fun main() {
   /* println(
        TwoCityScheduling.twoCitySchedCost(
            arrayOf(
                intArrayOf(10, 20),
                intArrayOf(30, 200),
                intArrayOf(400, 50),
                intArrayOf(30, 20)
            )
        )
    )*/

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
    )

   /* println(
        TwoCityScheduling.twoCitySchedCost(
            arrayOf(
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
        )
    )*/
}