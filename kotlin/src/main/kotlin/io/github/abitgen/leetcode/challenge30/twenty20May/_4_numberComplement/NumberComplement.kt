package io.github.abitgen.leetcode.challenge30.twenty20May._4_numberComplement

object NumberComplement {
    /**
     * My solution Leetcode - time 208ms
     */
    fun findComplement(num: Int): Int {
        return Integer.toBinaryString(num)
            .replace("0","x")
            .replace("1","0")
            .replace("x","1").toInt(2)
    }

    /**
     * Other solution Leetcode - time 120ms
     *
     * Explanation:
     *
     * Finding total leading zeros for the given number.
     * It will be (32 - total bits occupied by the number)
     * So Eg: num = 5, in binary => 101
     * count => 29
     * num.inv() => Ones Complement of binary 101 => 11111111111111111111111111111010 => -6
     * Shift Left 29 digits => 1000000000000000000000000000000
     * Shift Right 29 digits => 10
     * result is decimal of 10 => 2
     */
    fun findComplement2(num: Int): Int {
        val count = Integer.numberOfLeadingZeros(num)
        return num.inv().shl(count).shr(count)
    }


}

fun main(){
    println(NumberComplement.findComplement(10))
    println(NumberComplement.findComplement2(10))

}