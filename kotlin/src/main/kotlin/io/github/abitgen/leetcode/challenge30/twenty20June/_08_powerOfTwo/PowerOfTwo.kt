package io.github.abitgen.leetcode.challenge30.twenty20June._08_powerOfTwo

object PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        val trailCount = Integer.numberOfTrailingZeros(n)
        return n.shr(trailCount) == 1
    }
}

fun main(){
    println(PowerOfTwo.isPowerOfTwo(1))
    println(PowerOfTwo.isPowerOfTwo(16))
    println(PowerOfTwo.isPowerOfTwo(64))
    println(PowerOfTwo.isPowerOfTwo(218))
}