package io.github.abitgen.own.reverse_linkedlist

import io.github.abitgen.own.common.Node

class Reverselinkedlist<T>(val headNode: Node<T>) {
    var prev: Node<T>? = null
    var curr: Node<T>? = headNode
    var next: Node<T>? = headNode.next

    fun reverse(): Node<T>? {

        while(curr != null) {
            val nextOne = curr?.next
            curr?.next = prev
            prev = curr
            curr = nextOne
            next = nextOne?.next
        }
        return prev
    }
}

fun main(){
    val headNode = Node(10)
    headNode.apply {
        next = Node(20).apply {
            next = Node(30).apply {
                next = Node(40)
            }
        }
    }
    println(headNode)
    println(Reverselinkedlist(headNode).reverse())
}

