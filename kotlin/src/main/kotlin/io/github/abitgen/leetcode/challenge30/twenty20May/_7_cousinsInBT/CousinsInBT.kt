package io.github.abitgen.leetcode.challenge30.twenty20May._7_cousinsInBT

import io.github.abitgen.leetcode.common.TreeNode
object CousinsInBT {
    /**
     * While returning checking both x, y parent nodes are not the same,
     * but their depth value from the root is same.
     */
    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        val xDepth = treeDepthFor(root, null, x, 0)
        val yDepth = treeDepthFor(root, null, y, 0)
        return xDepth.first?.`val` != yDepth.first?.`val` && xDepth.second == yDepth.second
    }

    /**
     * The return Pair will hold the parentNode of the given child value, and the depth count of this child.
     */
    private fun treeDepthFor(node: TreeNode?, parentNode: TreeNode?, value:Int, depth:Int) : Pair<TreeNode?,Int>{
        if(node == null) return Pair(null,-1)
        if(node.`val` == value)
            return Pair(parentNode, depth)
        if(node.left == null && node.right == null)
            return Pair(null,-1)
        val leftPair = treeDepthFor(node.left, node, value, depth+1)
        val rightPair = treeDepthFor(node.right, node, value, depth+1)
        return if(leftPair.second > rightPair.second) leftPair else rightPair
    }
}

fun main(){

}

