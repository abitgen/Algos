package io.github.abitgen.leetcode.challenge30.twenty20April._23_bitwiseANDofRange

object BitwiseAndOfRange {
    /**
     *  My solution - leetcode - 448ms
     */
    fun rangeBitwiseAnd(m: Int, n: Int): Int {
        /**
         * Starting at -1 because bit value of -1 is all 1, so any number AND -1 will be the same number
         */
        var bitwiseAndValue:Int = -1
        var shiftCnt:Int = 0
        for(i in m..n){
            bitwiseAndValue = bitwiseAndValue and i
            /**
             * Addded this condition so as to avoid next set of bitwise AND operations, as any number AND 0 is 0
             */
            if(bitwiseAndValue == 0){
               break;
            }
            shiftCnt++
        }
        println("Total count $shiftCnt")

        return bitwiseAndValue
    }

    /**
     *  Other solution - leetcode - 168ms
     */
    fun rangeBitwiseAnd2(m: Int, n: Int): Int {
        var tmpM = m
        var tmpN = n
        var shiftCnt = 0

        while (tmpM != tmpN) {
            tmpM = tmpM shr 1
            tmpN = tmpN shr 1
            shiftCnt++

        }

        println("Total count $shiftCnt")
        return tmpN shl shiftCnt
    }
}

fun main(){
    println("~~~~~~~~~~~~~~~~~ 1 ~~~~~~~~~~~~~~~~~~~")
    println(BitwiseAndOfRange.rangeBitwiseAnd(5,7))
    println("~~~~~~~~~~~~~~~~~ 2 ~~~~~~~~~~~~~~~~~~~")
    println(BitwiseAndOfRange.rangeBitwiseAnd2(5,7))

    println("~~~~~~~~~~~~~~~~~ 1 ~~~~~~~~~~~~~~~~~~~")
    println(BitwiseAndOfRange.rangeBitwiseAnd(700000000,2147483641))
    println("~~~~~~~~~~~~~~~~~ 2 ~~~~~~~~~~~~~~~~~~~")
    println(BitwiseAndOfRange.rangeBitwiseAnd2(700000000,2147483641))

}