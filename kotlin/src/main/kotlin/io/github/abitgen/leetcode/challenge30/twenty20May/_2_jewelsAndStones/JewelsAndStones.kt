package io.github.abitgen.leetcode.challenge30.twenty20May._2_jewelsAndStones

object JewelsAndStones {
    fun numJewelsInStones(J: String, S: String): Int {
        val map = J.associateBy { it }
        var sum = 0
        //return S.sumBy { if(map.containsKey(it)) 1 else 0  }
        S.forEach {
            if(map.containsKey(it)) sum++
        }
        return sum
    }
}

fun main(){
    println(JewelsAndStones.numJewelsInStones("aA","aAAbbbb"))
}