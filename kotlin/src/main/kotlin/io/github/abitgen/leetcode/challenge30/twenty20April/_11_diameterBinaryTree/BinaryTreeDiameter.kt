package io.github.abitgen.leetcode.challenge30.twenty20April._11_diameterBinaryTree

import io.github.abitgen.basic.binary_tree.BinaryNode
import io.github.abitgen.basic.binary_tree.traversal.sampleBinaryTreeCharData
import io.github.abitgen.basic.binary_tree.traversal.sampleBinaryTreeCharData2
import io.github.abitgen.basic.binary_tree.traversal.sampleBinaryTreeNodeData3
import kotlin.math.max

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

object BinaryTreeDiameter {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        return diameterOfBinaryTree(root, hashMapOf<TreeNode?, Int>())
    }

    fun diameterOfBinaryTree(
        root: TreeNode?,
        heightMap: HashMap<TreeNode?, Int>
    ): Int {
        if (root == null) return 0

        val lHeight = getHeight(root.left, heightMap) ?: 0
        val rHeight = getHeight(root.right, heightMap) ?: 0

        val rootDiameter = (lHeight + rHeight).run {
            var x = this
            if (root.left != null)
                x += 1
            if (root.right != null)
                x += 1
            x
        }
        val maxSubTreeDiameter = max(
            diameterOfBinaryTree(root.left, heightMap),
            diameterOfBinaryTree(root.right, heightMap)
        )

        return max(rootDiameter, maxSubTreeDiameter)
    }

    private fun getHeight(root: TreeNode?, heightMap: HashMap<TreeNode?, Int>): Int? {
        if (heightMap[root] == null)
            heightMap[root] = findHeight(root, heightMap)
        return heightMap[root]
    }

    fun findHeight(node: TreeNode?, heightMap: HashMap<TreeNode?, Int>): Int {
        if (node == null) return 0;

        if (node.left == null && node.right == null) {
            return 0
        }

        var lHeight: Int = 1 + (getHeight(node.left, heightMap) ?: 0)
        var rHeight: Int = 1 + (getHeight(node.right, heightMap) ?: 0)

        return max(lHeight, rHeight)
    }
}

fun main() {
    println(BinaryTreeDiameter.diameterOfBinaryTree(sampleBinaryTreeNodeData3))
    print("")
}