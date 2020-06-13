package io.github.abitgen.basic.recursion.numberDigitSum

object DigitSum {

    fun findSum(num:Int): Int {
        return recurse(num)
    }

    private fun recurse(num : Int) : Int{
        return if(num/10 == 0) num
        else
            num%10 + recurse(num/10)
    }
}

fun main(){
    println(DigitSum.findSum(123456))
}