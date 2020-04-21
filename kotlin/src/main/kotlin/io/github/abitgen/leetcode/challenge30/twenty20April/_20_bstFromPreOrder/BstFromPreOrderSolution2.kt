package io.github.abitgen.leetcode.challenge30.twenty20April._20_bstFromPreOrder

import io.github.abitgen.leetcode.common.TreeNode

internal class BstFromPreOrderSolution2 {
    var i = 0
    fun bstFromPreorder(arr: IntArray): TreeNode? {
        if (arr.size == 0) return null
        i = 0
        val root = TreeNode(arr[i++])
        set(arr, root, Int.MIN_VALUE, Int.MAX_VALUE)
        return root
    }

    operator fun set(arr: IntArray, node: TreeNode, l: Int, r: Int) {
        if (i >= arr.size) return
        if (arr[i] < l) return
        if (arr[i] < node.`val` && arr[i] >= l) {
            node.left = TreeNode(arr[i++])
            set(arr, node.left!!, l, node.`val`)
        }
        if (i >= arr.size) return
        if (arr[i] > node.`val` && arr[i] <= r) {
            node.right = TreeNode(arr[i++])
            set(arr, node.right!!, node.`val`, r)
        }
    }
}

fun main(){
    BstFromPreOrderSolution2().bstFromPreorder(intArrayOf(8,5,1,7,10,12))
    println(" ")
}