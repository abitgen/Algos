package io.github.abitgen.leetcode.challenge30.twenty20April._8_middleLinkedlist

import io.github.abitgen.leetcode.common.ListNode
import io.github.abitgen.leetcode.common.utils.arrayToLinkedNode

/**
 *
 * Input
 * 0 1 2 3 4 5
 * Output
 * 3
 *
 * Input
 * 0 1 2 3 4 5 6 7 8
 * Output
 * 4
 */

object MiddleLinkedlist {
    fun middleNode(head: ListNode?): ListNode? {
        var mid: ListNode? = head
        var nextHead: ListNode? = head
        var count = 0
        while(nextHead != null){
            count++
            if(count == 1) mid = head
            else if(count%2 != 0) mid = mid?.next
            nextHead = nextHead.next
        }
        return if(count%2 == 0) mid?.next else mid
    }
}

fun main() {
    println(MiddleLinkedlist.middleNode(arrayToLinkedNode(intArrayOf(1,2,3,4,5,6,7,8),
        ListNode(0)
    )))
}