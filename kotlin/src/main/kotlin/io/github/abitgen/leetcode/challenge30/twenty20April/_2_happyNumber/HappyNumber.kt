package io.github.abitgen.leetcode.challenge30.twenty20April._2_happyNumber

import com.sun.org.apache.xpath.internal.operations.Bool
import io.github.abitgen.leetcode.challenge30.twenty20April._2_happyNumber.HappyNumber.isHappy
import kotlin.math.log10

object HappyNumber {
    /**
     * My solution with 160ms
     */
    private val notAHappyNumberList = hashMapOf<Int,Boolean>()
    fun isHappy(n: Int): Boolean {
        if(notAHappyNumberList[n] == true){
            return false
        }
        if(n == 1){
            return true
        }else{
            addToNotAHappyNumber(n)
            return isHappy(getEachDigit(n))
        }
    }

    /**
     * Leetcode solution posted with 104ms
     */
    private val hs = hashSetOf<Int>()
    fun isHappy2(n: Int): Boolean {
        if (n == 1) return true
        if (n <=0) return false

        if (hs.contains(n)) return false
        else hs.add(n)

        var sum = 0
        var i = n
        while (i > 0) {
            val digit = i%10
            sum += digit * digit
            i /= 10
        }
        return isHappy(sum)
    }

    private fun addToNotAHappyNumber(n:Int){
        notAHappyNumberList[n] = true
    }

    private fun getEachDigit(n: Int): Int {
        val digitList = n.toDigitArray()
        return digitList.sumBy {  i ->
            i.square()
        }
    }
}

private fun Int.toDigitArray(): List<Int> {
    return toString().map {  Integer.parseInt(it.toString()) }
}

private fun Int.isPowerOf10(): Boolean {
    return log10(this.toFloat()) - (toString().length-1) == 0.0F
}

private fun Int.square(): Int {
    return this*this
}

fun main(){
    println(isHappy(92))
}