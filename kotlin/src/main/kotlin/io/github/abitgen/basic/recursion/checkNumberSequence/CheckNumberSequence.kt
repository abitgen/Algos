package io.github.abitgen.basic.recursion.checkNumberSequence

object CheckNumberSequence {
    fun check(arr: IntArray): Boolean {

        return if(arr.size >=2){
            val diff = arr[1] - arr[0]
            recurse(arr, diff, 1)
        }else
            true
    }

    private fun recurse(arr:IntArray, diff:Int, index:Int): Boolean {
        if(index == arr.size-1) return true
        return if(arr[index] == arr[index-1] + diff)
            recurse(arr, diff, index+1)
        else
            false
    }
}

fun main(){
    println(CheckNumberSequence.check(intArrayOf(2,3,4,5,6,7))) // true
    println(CheckNumberSequence.check(intArrayOf(2,3,4,6,7))) // false
}