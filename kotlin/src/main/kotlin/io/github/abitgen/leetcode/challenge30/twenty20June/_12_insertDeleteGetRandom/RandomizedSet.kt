package io.github.abitgen.leetcode.challenge30.twenty20June._12_insertDeleteGetRandom

import kotlin.random.Random

class RandomizedSet {
    /** Initialize your data structure here. */

    val set = hashSetOf<Int>()


    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    fun insert(`val`: Int): Boolean {
        if(set.contains(`val`)) return false

        set.add(`val`)
        return true
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    fun remove(`val`: Int): Boolean {
        if(!set.contains(`val`)) return false

        set.remove(`val`)
        return true
    }

    /** Get a random element from the set. */
    fun getRandom(): Int {
        return set.random()
    }
}

fun main(){
    val randomizedSet = RandomizedSet()
        .apply {

            println(insert(1))
            println(remove(2)) // false, not present
            println(insert(2))
            println(getRandom())
            println(remove(1))
            println(insert(2)) // false, already present
            println(getRandom())

        }
}