package io.github.abitgen.leetcode.challenge30.twenty20June._02_deleteNodeInLL

import io.github.abitgen.leetcode.common.ListNode
import io.github.abitgen.leetcode.common.utils.arrayToLinkedNode
import io.github.abitgen.leetcode.common.utils.filter
import io.github.abitgen.leetcode.common.utils.printLinkedNodes

class DeleteNodeInLL(val root: ListNode?) {
    fun deleteNode(node: ListNode?) {
        node?.`val` = node?.next?.`val` ?: 0
        node?.next = node?.next?.next
    }
}


fun main() {
    val root = arrayToLinkedNode(intArrayOf(5, 1, 9), ListNode(4))
    val deleteNode = root.filter(5)

    println("Given $root")
    printLinkedNodes(root)

    DeleteNodeInLL(root).deleteNode(deleteNode)

    println("After Deleting Node ${deleteNode?.`val`}")
    printLinkedNodes(root)
}