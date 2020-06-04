package io.github.abitgen.leetcode.challenge30.twenty20June._04_reverseString

object ReverseString {
    fun reverseString(s: CharArray): Unit {

        if(s.isEmpty()) return

        var mid = (s.size-1)/2
        val indices = s.size-1

        if(s.size%2 != 0){
            // If odd number swap should start from previous of mid element, becuase there are equal elements left, right to mid.
            mid--
        }
        while(mid >= 0){
            //swap both elements at equal position from start and end
            val temp = s[mid]
            s[mid] = s[indices - mid]
            s[indices - mid] = temp
            mid --
        }
    }
}

fun main(){
    val arr = charArrayOf(
        'h','e','l','l','o'
    )

    val arr2 = charArrayOf(
        'h','e','l','l','o','W','o','r','l','d'
    )
    println(" Initial > ${arr.joinToString()}")

    ReverseString.reverseString(arr)

    println(" Reverse > ${arr.joinToString()}")

    println(" Initial > ${arr2.joinToString()}")

    ReverseString.reverseString(arr2)

    println(" Reverse > ${arr2.joinToString()}")
}