package io.github.abitgen.leetcode.challenge30.twenty20April._10_minStack

class MinStack() {

    /** initialize your data structure here. */
    private var top: SinglyLinkedWithMinNode<Int>? = null

    private fun minOf(top: SinglyLinkedWithMinNode<Int>, prevMin: SinglyLinkedWithMinNode<Int>): SinglyLinkedWithMinNode<Int>? {
        return if(top.data!! < prevMin.data!!) top else prevMin
    }

    fun push(x: Int) {
        val element = SinglyLinkedWithMinNode(x)
        if(top == null)
            top = element
        else {
            element.next(top)
            top = element
        }
        if(element.nextElement == null)
            element.minElement = element
        else
            element.minElement = minOf(top!!, top?.nextElement?.minElement!!)
    }

    fun pop() {
        val popped = top
        val nextTop = top?.nextElement
        top = nextTop
    }

    fun top(): Int  = top?.data!!

    fun getMin(): Int = top?.minElement?.data!!
}

class SinglyLinkedWithMinNode<E>(val data: E?= null) {
    var nextElement: SinglyLinkedWithMinNode<E>? = null
    var minElement: SinglyLinkedWithMinNode<E>? = null
}

fun <E> SinglyLinkedWithMinNode<E>.next(next : SinglyLinkedWithMinNode<E>?){
    nextElement = next
}