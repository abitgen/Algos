package io.github.abitgen.leetcode.challenge30.twenty20May._10_findTheTownJudge

import kotlin.math.sign

object FindTheTownJudge {

    /**
     * My solution leetcode time - 484ms
     */
    fun findJudge(N: Int, trust: Array<IntArray>): Int {
        if(N == 1) return 1
        val trustingPersonSet = trust.map { it[0] }.toSet()
        val trustedPersonSet = trust.map { it[1] }.toSet()
        var judge =  trustedPersonSet.minus(trustingPersonSet).firstOrNull()
        if(judge == null) return -1
        else{
            judge =  if(trust.count { it[1] == judge } == N-1) judge else -1
        }
        return judge
    }

    /**
     * Other Solution  leetcode time - 368ms
     */
    fun findJudge2(N: Int, trust: Array<IntArray>): Int {
        val trustCounts = IntArray(N + 1)
        for (i in trust) {
            trustCounts[i[0]]--
            trustCounts[i[1]]++
        }

        for (i in 1..N) {
            if(trustCounts[i] == N - 1) return i
        }
        return -1
    }
}
}

fun main(){
    println(FindTheTownJudge.findJudge(4,
        arrayOf(
            intArrayOf(1,3),intArrayOf(1,4),intArrayOf(2,3),intArrayOf(2,4),intArrayOf(4,3)
        ))) // 3
}