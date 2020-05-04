package io.github.abitgen.leetcode.challenge30.twenty20May._3_ransomNote

object RansomNote{
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if(ransomNote.length > magazine.length) return false

        val magazineCountMap = magazine.countByChar()
        val ransomCountMap = ransomNote.countByChar()

        ransomCountMap.forEach { (key, value) ->

            if(magazineCountMap[key] ?: 0 >= 1) {
                ransomCountMap[key] = ransomCountMap.getOrDefault(key, 0).minus(magazineCountMap.getOrDefault(key, 0))
            }
        }
        return ransomCountMap.filterValues { value -> value > 0 }.isEmpty()
    }
}

fun CharSequence.countByChar() : HashMap<Char, Int>{
    var sum = 0
    var map = hashMapOf<Char,Int>()
    for(i in this){
        map[i] = map.getOrDefault(i, 0).plus(1)
    }
    return map
}

fun main(){
    println(RansomNote.canConstruct("a","b")) // false
    println(RansomNote.canConstruct("aa","aab")) //true
    println(RansomNote.canConstruct("aa","ab")) //false
}