package io.github.abitgen.leetcode.challenge30.twenty20April._22_subarraySumEqualsK

object SubArraySumEqualsK {

    /**
     * My solution O(n^2) leetcode - 3688 ms
     */
    fun subarraySum1(nums: IntArray, k: Int): Int {
        val sumMap = hashMapOf<Int,Int>( 0 to nums.getOrElse(0){0} )
        for(i in 1 until nums.size){
            sumMap[i] = (sumMap[i-1] ?: 0) + nums[i]
        }

        var count = 0
        for(i in nums.indices){
            if(sumMap[i]!! == k){ count++ }
            for(j in i+1 until nums.size){
                if(sumMap[j]!! - sumMap[i]!! == k)
                    count++
            }
        }
        return count
    }

    /**
     * Other optimized solution O(n) leetcode - 232 ms
     */
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var sum = 0
        val map = hashMapOf<Int,Int>( 0 to 1 )


        for(element in nums){

            //1. On each iteration update the sum by adding current element to it
            sum += element

            //2a. If (sum -k) key is already present in the map update the count.
            if(map.containsKey(sum - k)){
                count += map[sum-k]!!
            }

            //2b. increment the value for sum key in map
            map[sum] = map.getOrDefault(sum , 0) + 1
        }

        return count
    }

}


fun main(){
    println(SubArraySumEqualsK.subarraySum(
        intArrayOf(1,5,3,3,6), 6
    ))

    println(SubArraySumEqualsK.subarraySum(
        intArrayOf(1,5,3,3,3,6), 6
    ))

    println(SubArraySumEqualsK.subarraySum(
        intArrayOf(1,1,1,1,2), 2
    ))

    println(SubArraySumEqualsK.subarraySum(
        intArrayOf(1,3,3,3,2,1,0,-3,9), 9
    ))



}