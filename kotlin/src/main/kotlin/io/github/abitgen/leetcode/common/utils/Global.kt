package io.github.abitgen.leetcode.common.utils

import io.github.abitgen.leetcode.common.ListNode

class Global {
}

fun arrayToLinkedNode(arr:IntArray, head: ListNode?): ListNode? {
    var nextHead = head
    for(item in arr){
        nextHead?.next = ListNode(item)
        nextHead = nextHead?.next
    }
    return head;
}

fun printLinkedNodes(head: ListNode?){
    println(head)
}

fun ListNode?.filter(value:Int) : ListNode?{
    var node = this

    while(node!=null){
        if(node.`val` == value) return node
        node = node.next
    }
    return null
}