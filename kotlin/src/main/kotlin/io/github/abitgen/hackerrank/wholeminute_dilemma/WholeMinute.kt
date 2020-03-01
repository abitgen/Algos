package io.github.abitgen.hackerrank.wholeminute_dilemma

class WholeMinute {
    fun numPairsDivisibleBy60(time: IntArray): Int {
        val divisor = 60
        val map = IntArray(divisor)
        var count = 0
        for (i in time.indices) {
            // Taking Mod of the given divisor
            var rest = time[i] % divisor
            if (rest == 0) {
                rest = divisor
            }
            // Setting value to map as the differnce with the remainder
            val value = map[divisor - rest]
            // If a value is present adding to the count
            count += value
            if (rest == divisor) {
                rest = 0
            }
            //
            map[rest]++
        }
        return count
    }

    fun numPairsDivisibleByDiv(time: IntArray): Int {
        val DIVISOR = 60
        val map = hashMapOf<Int, Int>()
        var count = 0
        for (i in time.indices) {
            // Taking Mod of the given divisor
            var rest = time[i] % DIVISOR

            // Setting value to map as the difference with the remainder
            val value = map[DIVISOR - rest] ?: 0
            // If a value is present adding to the count
            count += value

            //
            map[rest] = (map[rest] ?: 0).inc()
        }
        return count
    }

}

fun main(args: Array<String>) {
    println(WholeMinute().numPairsDivisibleBy60(intArrayOf(30, 50, 60, 10, 10, 50, 10, 40)))
    println(WholeMinute().numPairsDivisibleByDiv(intArrayOf(30, 50, 60, 10, 10, 50, 10, 40)))

}