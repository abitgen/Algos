package io.github.abitgen.own.sum_pair

import java.util.*

object ArrayOne {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(3, 4, 4)
        Arrays.stream(arr).reduce(2){a,b ->
            a+b
        };
    }

    fun some(){
    }

    fun some2(){

    }
}