package io.github.abitgen.basic.binary_tree.binary_Search_tree

import io.github.abitgen.basic.binary_tree.traversal.IntNode

class InsertionBST {
    fun insert(rootNode: IntNode?, value: Int): IntNode {

        if (rootNode == null) {
            return IntNode(value)
        }

/*        if(sampleBstNode?.data !=null) {
            if (sampleBstNode.leftNode == null && sampleBstNode.data > value) {
                sampleBstNode.leftNode = IntNode(value)
                return rootNode
            }

            if (sampleBstNode.rightNode == null && sampleBstNode.data < value) {
                sampleBstNode.rightNode = IntNode(value)
                return rootNode
            }
        }*/

        if ( value <= rootNode.data) {
            rootNode.leftNode = insert(rootNode.leftNode, value)
        } else {
            rootNode.rightNode = insert(rootNode.rightNode, value)
        }
        return rootNode
    }
}

fun main() {
    val insertionBST = InsertionBST()
    insertionBST.insert(sampleValidBinarySearchTreeData, 3)
    insertionBST.insert(sampleValidBinarySearchTreeData,6)
}