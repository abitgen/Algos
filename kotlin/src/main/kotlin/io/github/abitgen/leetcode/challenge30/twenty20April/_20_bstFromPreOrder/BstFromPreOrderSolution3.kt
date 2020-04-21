package io.github.abitgen.leetcode.challenge30.twenty20April._20_bstFromPreOrder

import io.github.abitgen.leetcode.common.TreeNode
import java.util.*

/**
 * Not my solution, added for clear solution
 */
class BstFromPreOrderSolution3 {
    fun bstFromPreorder(preorder: IntArray): TreeNode? {

        val stack = Stack<Int>()
        for (element in preorder) {
            stack.push(element)
        }

        return createBST(stack, Integer.MIN_VALUE, Integer.MAX_VALUE)
    }

    private fun createBST(array: Stack<Int>, start: Int, end: Int): TreeNode? {
        //Get the topmost stack element
        val element: Int = array.peek() ?: return null

        //A Node will be a leaf if its value is less than start or more than end
        if (array.peek() < start || array.peek() > end) return null

        // Create a Node from the top stack element
        val node = TreeNode(element)

        // Pop the node, so the next recusive call gets the next top element in stack
        array.pop()

        // A child node will be added to left if its in range of start bound MIN_VALUE and the parent node
        node.left = createBST(array, start, element)

        // A child node will be added to right if its in range of the parent node and end bound MAX_VALUE
        node.right = createBST(array, element, end)

        return node
    }
}


fun main(){
    BstFromPreOrderSolution3().bstFromPreorder(intArrayOf(8,5,1,7,10,12))
    println(" ")
}