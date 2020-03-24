package io.github.abitgen.basic.binary_tree.binary_Search_tree

import io.github.abitgen.basic.binary_tree.BinaryNode

class MinValueBST {
    fun minValue(head: BinaryNode<Int>?): Int? {

        if (head == null) {
            return null;
        }

        return if (head.leftNode != null)
                  minValue(head.leftNode)
               else head.data
    }
}

fun main() {
    val minValueBST = MinValueBST()
    val minValue = minValueBST.minValue(sampleValidBinarySearchTreeData)
    println("Minimum Value in BST is : $minValue")
}