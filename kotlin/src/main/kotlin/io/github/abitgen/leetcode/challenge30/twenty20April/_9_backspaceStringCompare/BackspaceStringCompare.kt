package io.github.abitgen.leetcode.challenge30.twenty20April._9_backspaceStringCompare

object BackspaceStringCompare {
    fun backspaceCompare(S: String, T: String): Boolean {
        return getHashlessString(S) == getHashlessString(T)
    }

    fun getHashlessString(str: String): String {
        var modString = str
        var i = 0
        while(i <= modString.length-1){
            if(modString[i] == '#'){
                modString =
                    (if(i == 0) "" else
                        modString.substring(0 until i-1)).plus(
                     if(i+1 == modString.length) "" else
                        modString.substring( i+1 until modString.length))
                i = 0
            }else
                i++
        }
        return modString
    }
}

fun main(){
    println(BackspaceStringCompare.backspaceCompare("#a#c", "a##c"))
    println(BackspaceStringCompare.backspaceCompare("ab##", "c#d#"))

}