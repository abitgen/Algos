package io.github.abitgen.leetcode.challenge30.twenty20May._6_majorityElement

object MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        val map = hashMapOf<Int,Int>()
        for(num in nums){
            map[num] = map.getOrDefault(num, 0) + 1
        }
        return map.maxBy { it.value }?.key ?: -1
    }
}

fun main(){
    println(MajorityElement.majorityElement(intArrayOf(2,2,1,1,1,2,2)))
}