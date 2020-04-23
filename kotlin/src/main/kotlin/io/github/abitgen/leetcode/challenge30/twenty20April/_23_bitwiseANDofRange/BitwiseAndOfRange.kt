package io.github.abitgen.leetcode.challenge30.twenty20April._23_bitwiseANDofRange

object BitwiseAndOfRange {
    fun rangeBitwiseAnd(m: Int, n: Int): Int {
        /**
         * Starting at -1 because bit value of -1 is all 1, so any number AND -1 will be the same number
         */
        var bitwiseAndValue:Int = -1
        for(i in m..n){
            bitwiseAndValue = bitwiseAndValue and i
            /**
             * Addded this condition so as to avoid next set of bitwise AND operations, as any number AND 0 is 0
             */
            if(bitwiseAndValue == 0){
                return bitwiseAndValue
            }
        }
        return bitwiseAndValue
    }
}

fun main(){
    println(BitwiseAndOfRange.rangeBitwiseAnd(5,7))
    println(BitwiseAndOfRange.rangeBitwiseAnd(5,7))
    println(BitwiseAndOfRange.rangeBitwiseAnd(700000000,2147483641))
}