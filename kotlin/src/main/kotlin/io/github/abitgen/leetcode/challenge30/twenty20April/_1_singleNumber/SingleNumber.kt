package io.github.abitgen.leetcode.challenge30.twenty20April._1_singleNumber

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

object SingleNumber {
    /**
     * Leetcode time - 220ms
     */
    fun singleNumber(nums: IntArray): Int {
        val map = hashMapOf<Int, Boolean>()
        for(i in nums){
            map[i] = map[i] == null
        }

        return nums.first {
            map[it] == true
        }

    }

    /**
     * Leetcode submission for lowest running time - 136ms
     */
    fun singleNumber2(nums: IntArray): Int {
        if(nums.size==1)return nums[0]
        var result = 0
        nums.forEach {
            result = result xor it
        }
        return result
    }
}

fun main() {
    val lowTimeSolution = measureNanoTime { println(SingleNumber.singleNumber2(intArrayOf(4,1,2,1,2))) }
    //val mySolution = measureTimeMillis { println(SingleNumber.singleNumber(intArrayOf(4,1,2,1,2))) }

    //println("My Solution time in milli : ${mySolution.toFloat()/1000000}")
    println("Other leetcode Solution time in milli : ${lowTimeSolution.toFloat()/1000000}")

}