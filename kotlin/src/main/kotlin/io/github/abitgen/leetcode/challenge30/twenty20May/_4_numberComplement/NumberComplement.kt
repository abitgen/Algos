package io.github.abitgen.leetcode.challenge30.twenty20May._4_numberComplement

object NumberComplement {
    fun findComplement(num: Int): Int {
        return Integer.toBinaryString(num)
            .replace("0","x")
            .replace("1","0")
            .replace("x","1").toInt(2)
    }
}

fun main(){
    println(NumberComplement.findComplement(10))
}