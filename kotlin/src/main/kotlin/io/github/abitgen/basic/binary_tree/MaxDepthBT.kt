package io.github.abitgen.basic.binary_tree

import io.github.abitgen.basic.binary_tree.traversal.sampleBinaryTreeCharData
import kotlin.math.max

class MaxDepthBT {
    fun maxDepth(head: BinaryNode<Char>?): Int {
        if(head == null) return 0
        if (head.leftNode == null && head.rightNode == null) {
            return 0
        }

        val leftCount  = 1 + maxDepth(head.leftNode)
        val rightCount = 1 + maxDepth(head.rightNode)

        return max(leftCount, rightCount)

    }
}

fun main() {
    val maxDepthBT = MaxDepthBT()
    val maxDepth = maxDepthBT.maxDepth(sampleBinaryTreeCharData)
    println("Max Depth of BT is : $maxDepth")
}