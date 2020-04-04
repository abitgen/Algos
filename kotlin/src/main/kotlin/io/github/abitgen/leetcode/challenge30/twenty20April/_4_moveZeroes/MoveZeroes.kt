package io.github.abitgen.leetcode.challenge30.twenty20April._4_moveZeroes

object MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        println("inital array : ${nums.joinToString  ()}")
        var nonZeroIndex = -1
        for(i in nums.indices){
            if(nums[i] != 0){
                if(nums[nonZeroIndex+1] == 0) {
                    val temp = nums[i]
                    nums[i] = 0
                    nums[nonZeroIndex+1] = temp

                }
                nonZeroIndex++
            }

        }
        println("final array : ${nums.joinToString()}")
    }

}
fun main(){
    MoveZeroes.moveZeroes(intArrayOf(0,1,0,3,12))
}