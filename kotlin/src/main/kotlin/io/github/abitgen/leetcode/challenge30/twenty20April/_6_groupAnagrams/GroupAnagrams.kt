package io.github.abitgen.leetcode.challenge30.twenty20April._6_groupAnagrams

object GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val outMap = hashMapOf<String, MutableList<String>>()
        val mapIndexed = strs.forEach {
            val sortedString :String = it.toCharArray().sorted().joinToString("")
            if(outMap[sortedString] == null){
                outMap[sortedString] = mutableListOf<String>(it)
            }else{
                outMap[sortedString]?.add(it)
            }
        }

        return outMap.map { it.value }
    }

    fun groupAnagramsFirstAttempt(strs: Array<String>): List<List<String>> {

        val stringSet = hashSetOf<String>()
        val mapIndexed = strs.mapIndexed { i, it ->
            val sortedString = it.map{it}.sorted().joinToString (separator = "")
            stringSet.add(sortedString)
            Pair(i, sortedString)
        }
        val outList = mutableListOf<List<String>>()
        val outMap = hashMapOf<String, MutableList<String>>()
        val group = mapIndexed.mapNotNull {

            if(stringSet.contains(it.second)){
                if(outMap[it.second] == null){
                    outMap[it.second] = mutableListOf<String>(strs[it.first])
                    return@mapNotNull outMap[it.second]
                }else{
                    outMap[it.second]?.add(strs[it.first])
                }
            }
            return@mapNotNull null
        }
        return group
    }
}

fun main(){
    print(GroupAnagrams.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat", "boo","bob")))
}