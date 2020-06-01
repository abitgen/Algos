package io.github.abitgen.leetcode.challenge30.twenty20June._01_invertBT

import io.github.abitgen.basic.binary_tree.traversal.sampleBinaryTreeIntData
import io.github.abitgen.leetcode.common.TreeNode

object InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        recurInvert(root)
        return root
    }

    private fun recurInvert(head : TreeNode?){
        if(head == null) return



        val tempLeft = head.left
        head.left = head.right
        head.right = tempLeft

        recurInvert(head.left)
        recurInvert(head.right)

    }
}

fun main(){
    println(InvertBinaryTree.invertTree(
        TreeNode(4).apply {
            right = TreeNode(7).apply {
                right  = TreeNode(9)
                left = TreeNode(6)
            }
            left  = TreeNode(2).apply {
                right = TreeNode(3)
                left = TreeNode(1)
            }
        }
    ))
}