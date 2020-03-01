package io.github.abitgen.hackerrank.wholeminute_dilemma

import kotlin.math.ceil

class WholeMinuteDilemma2 {
}

fun main(){
    val list = listOf(30,20,150,100,40) /*listOf(3,60,60,60)*/
    val multipleOf = 60
    val max = list.max()!!+1
    val listSize = list.size

    val pairList = mutableListOf<Pair<Int,Int>>()

    // Sum of any two number should be multiple of 60



   /* list.forEachIndexed { index, item ->
        var newMultiple = multipleOf*//*ceil(item/multipleOf.toDouble()).toInt()*multipleOf*//*
        var i =1;
        while(newMultiple < max!!){
            val subList = list.subList(index+1, listSize)
            val abs = Math.abs(item - newMultiple)
            if(subList.contains(abs) || abs == 0){
                count++
                pairList.add(item to Math.abs(item - newMultiple))
                i++
                newMultiple = multipleOf*i
            }else{
                newMultiple = max
            }
        }
    }*/
    //println(count)
    println(pairList)
}



fun chooseRecu2(baseMultiple:Int, nextMultiple:Int, maxVal:Int){
    /*if(nextMultiple == -1)
        return
    else if(maxVal < nextMultiple)
        return chooseRecu(-1, maxVal)
    else{
        return chooseRecu(baseMultiple)
    }*/
}