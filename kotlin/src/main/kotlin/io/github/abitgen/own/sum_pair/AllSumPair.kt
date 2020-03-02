package io.github.abitgen.own.sum_pair

class AllSumPair {
}

fun main(){
    val array = intArrayOf(10,20,40,40,16,34)
    val requiredNum = 50

    var nextItem = -1;
    var oneItem = -1
    val map = hashMapOf<Int, Int>()
    val allPossiblePairs = mutableListOf<Pair<Int,Int>>()

    for( i in array.indices){
        map[requiredNum - array[i]] = i
        if(map[array[i]] != null){
            oneItem = map[array[i]] ?: 0
            nextItem = i
            allPossiblePairs.add(oneItem to nextItem)
        }
    }

    if(nextItem == -1 ){
        println("Pair not found")
    }else{
        println("Pair Found at ($oneItem, $nextItem)")
        println("All Possible Pairs at = $allPossiblePairs")
    }
}