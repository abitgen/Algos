package io.github.abitgen.hackerrank.wholeminute_dilemma

class WholeMinuteDilemma {
}

fun main(){
    val list = listOf(30,20,150,100,40)
    val multipleOf = 60
    val max = list.max()
    val pairList = mutableListOf<Pair<Int,Int>>()
/*    for( i in list.indices){
        if(i < multipleOf){
            val nextSum = multipleOf - list[i]
            if(list.contains(nextSum))
                pairList.add(i to list.indexOf(nextSum))
        }else{
            var i = multipleOf
            var j = 1;
            while(max!! <= list[i]){
                j++
                i *= j
            }
        }
    }*/

    var i =0
    var count = 0
    while(i < list.size){
        var j =i+1
        while(j < list.size){
            if((list[i]+list[j])%60 == 0){
                count++
            }
            j++
        }
        i++
    }
    println(count)
}

fun chooseRecu(baseMultiple:Int, nextMultiple:Int, maxVal:Int){
    /*if(nextMultiple == -1)
        return
    else if(maxVal < nextMultiple)
        return chooseRecu(-1, maxVal)
    else{
        return chooseRecu(baseMultiple)
    }*/
}