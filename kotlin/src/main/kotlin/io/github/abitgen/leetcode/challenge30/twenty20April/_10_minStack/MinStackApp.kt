package io.github.abitgen.leetcode.challenge30.twenty20April._10_minStack

fun main() {
    val myStack = MinStack().apply {
        push(-2)
        push(0)
        push(-3)
        println(getMin())
        println(pop())
        println(top())
        println(getMin())

    }

    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    val myStack2 = MinStack().apply {
        push(2)
        push(0)
        push(3)
        push(0)
        println(getMin())
        println(pop())
        println(getMin())
        println(pop())
        println(getMin())
        println(pop())
        println(getMin())
    }
}