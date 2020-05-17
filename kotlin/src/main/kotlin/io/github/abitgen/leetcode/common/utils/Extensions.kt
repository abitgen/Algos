package io.github.abitgen.leetcode.common.utils

import io.github.abitgen.leetcode.challenge30.twenty20April._8_middleLinkedlist.ListNode

class Extensions {
}

fun IntArray.toListNode(): ListNode {
    val head = ListNode(this[0])
    var node:ListNode? = head
    for(i in 1 until this.size){
         node?.next = ListNode(this[i])
         node = node?.next
    }
    return head
}