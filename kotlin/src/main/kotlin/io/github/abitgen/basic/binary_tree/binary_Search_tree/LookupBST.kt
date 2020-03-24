package io.github.abitgen.basic.binary_tree.binary_Search_tree

import io.github.abitgen.basic.binary_tree.traversal.IntNode

class LookupBST {
    fun lookup(head: IntNode?, value: Int): IntNode? {
        if (head == null) {
            return  null
        }
        if(head.data == value){
            return head
        }

        return if ( value <= head.data) {
            lookup(head.leftNode, value)
        } else {
            lookup(head.rightNode, value)
        }
    }
}

fun main() {
    val lookupBST = LookupBST()
    val value = 70
    val lookup = lookupBST.lookup(sampleValidBinarySearchTreeData, value)
    if(lookup == null)
        println("Node with value $value not found")
    else
        println("Node with value $value is found")
}