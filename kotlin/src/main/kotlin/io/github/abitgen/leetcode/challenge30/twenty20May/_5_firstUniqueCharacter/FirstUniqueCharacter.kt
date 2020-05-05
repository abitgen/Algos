import java.util.*

object FirstUniqueCharacter{
    /**
     * My solution -leetcode time - 312ms
     */
    fun firstUniqChar(s: String): Int {
        val firstUniqueChar = getCharRepeatingMap(s).filter { it.value }.keys.firstOrNull()
        return if (firstUniqueChar == null) -1
                else s.indexOf(firstUniqueChar)
    }

    private fun getCharRepeatingMap(s: String): LinkedHashMap<Char, Boolean> {
        val map = linkedMapOf<Char, Boolean>()
        for(i in s.indices){
            map[s[i]] = map[s[i]] == null
        }
        return map
    }

    /**
     * Other solution - leetcode time - 200ms
     */

    fun firstUniqChar2(s: String): Int {
        if(s.isEmpty())
            return -1

        val arr = IntArray(26) { 0 }

        for(element in s) {
            arr[element -'a']++
        }

        //println("ARR ${arr.toList()}")

        for(i in s.indices) {
            if(arr[s[i]-'a'] == 1)
                return i
        }

        return -1
    }
}

fun main(){
    println(FirstUniqueCharacter.firstUniqChar("lovetocode4goodlife"))
    println(FirstUniqueCharacter.firstUniqChar2("lovetocode4goodlife"))
}