package io.github.abitgen.hackerrank.palindrome.all_palindrome

object AllPalindrome {

}
fun main(){
    val str = "abcacba"
    val outputList = mutableListOf<String>()
    str.forEachIndexed { index,  c ->

        var previous = if(str.length %2 ==0) index else index-1
        var next = index+1

        outputList.add("$c")
        while(previous >= 0 && next<= str.length-1 && str[previous] == str[next]){
            outputList.add(str.substring(previous, next+1))
            previous--
            next++
        }
    }

    println(outputList)

}
