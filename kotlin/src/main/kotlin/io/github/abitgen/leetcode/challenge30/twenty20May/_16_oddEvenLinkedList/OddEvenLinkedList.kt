package io.github.abitgen.leetcode.challenge30.twenty20May._16_oddEvenLinkedList

import io.github.abitgen.leetcode.challenge30.twenty20April._8_middleLinkedlist.ListNode
import io.github.abitgen.leetcode.common.utils.toListNode

object OddEvenLinkedList {
    fun oddEvenList(head: ListNode?): ListNode? {
        var oddPointer = head
        val initEvenPointer = head?.next
        var evenPointer = initEvenPointer

        while (oddPointer?.next != null) {

            /**
             *  Get The second next node from the head. And set as head's next.
             */
            oddPointer.next = oddPointer.next?.next

            /**
             *  Changing the current odd Pointer, to the next odd Pointer set above
             *  For Last Index being Even Number (size-1) in A array, the above assignment will be null
             *  So making sure oddPointer doesn't be null, as its used finally when adding even list next to it.
             *  And hence the null coalescing check here
             */
            oddPointer = oddPointer.next ?: oddPointer


            /**
             * The Next Even Pointer will be the next node of odd Pointer
             */
            evenPointer?.next = oddPointer.next

            /**
             *  Changing the current even Pointer, to the next even Pointer set above
             */
            evenPointer = evenPointer?.next

        }
        /**
         * oddPointer will hold the last even index item whose next will be null.
         * Setting the last odd Pointer's next to the head of even pointer.
         */
        oddPointer?.next = initEvenPointer
        return head
    }
}

fun main() {
    /*val oddEvenList = OddEvenLinkedList.oddEvenList(
        ListNode(0).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5).apply {
                                next = ListNode(6)
                            }
                        }
                    }
                }
            }
        }
    )*/

    //println(oddEvenList)

    println(OddEvenLinkedList.oddEvenList(intArrayOf(0, 1, 2, 3, 4, 5, 6).toListNode()))

    println(OddEvenLinkedList.oddEvenList(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8).toListNode()))
}