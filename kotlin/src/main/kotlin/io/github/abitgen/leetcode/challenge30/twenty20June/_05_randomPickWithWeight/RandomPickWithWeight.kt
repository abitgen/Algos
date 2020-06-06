package io.github.abitgen.leetcode.challenge30.twenty20June._05_randomPickWithWeight

import java.util.*
import kotlin.random.Random

class RandomPickWithWeight(val w: IntArray) {

    val sum:Int  by lazy { w.sum() }
    val ranges = IntArray(w.size)
    var random = Random.Default

    init{
        var sum = 0
        for(i in w.indices){
            sum+=w[i]
            ranges[i] = sum
        }
        println("Cumulative Sum array ${ranges.joinToString()}")
    }

    fun pickIndex(): Int {

        val randomNum = random.nextInt(0, sum) + 1
        println("Random $randomNum")
        val bsResult = Arrays.binarySearch(ranges, randomNum)
        return if(bsResult < 0)
            kotlin.math.abs(bsResult) - 1
        else
            bsResult
    }
}

fun main(){
    RandomPickWithWeight(intArrayOf(3, 14, 1, 7)).apply {
        println(pickIndex())
        println(pickIndex())
        println(pickIndex())
        println(pickIndex())
        println(pickIndex())
        println(pickIndex())
    }
}