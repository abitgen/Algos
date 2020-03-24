package io.github.abitgen.basic.binary_tree.binary_Search_tree

import io.github.abitgen.basic.binary_tree.traversal.IntNode

class CheckBTisBST {
    fun checkBT(head: IntNode?): Boolean {

        // Base Case, Return true until leaf is found
        if(head?.leftNode == null && head?.rightNode==null) return true

        // If left node data is more than head data  return false
        if (head.leftNode != null && head.leftNode!!.data > head.data) {
            return false
        }

        // If right node data is less than head data  return false
        if (head.rightNode != null && head.rightNode!!.data < head.data) {
            return false
        }


        return checkBT(head.leftNode) && checkBT(head.rightNode)

    }
}

fun main() {
    val checkBTisBST = CheckBTisBST()
    val bool = checkBTisBST.checkBT(sampleInvalidBinarySearchTreeData2)
    if (bool)
        println(" Its a Valid Binary Search Tree")
    else
        println(" Its NOT a Valid Binary Search Tree")
}