package io.github.abitgen.leetcode.challenge30.twenty20April._10_minStack.using_linkedlist

import java.util.*

class MinStack() {

    /** initialize your data structure here. */
    val stack = LinkedList<Int>()
    val minStack = LinkedList<Int>()

    fun push(x: Int) {
        stack.push(x)
        minStack.push(kotlin.math.min(getMin(), x))
    }

    fun pop() {
        stack.pop()
        minStack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return if(minStack.size == 0) Int.MAX_VALUE
        else minStack.peek()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */