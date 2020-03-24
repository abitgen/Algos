package io.github.abitgen.basic.binary_tree.binary_Search_tree

import io.github.abitgen.basic.binary_tree.BinaryNode

/**
 * Print all nodes within a range in a binary search tree
 */
class GetRangeInBST {
    fun isInRange(head: BinaryNode<Int>?, low: Int, high: Int, process: (BinaryNode<Int>)->Unit) {
        // Base Case
        if(head ==null) return;


        // recursive case to check
        if(low <= head.data)
            isInRange(head.leftNode, low, high, process)

        if(head.data in low until high)
            process(head)

        if(high > head.data)
            isInRange(head.rightNode, low, high, process)
    }
}

fun main(){
    val getRangeInBST = GetRangeInBST()
    getRangeInBST.isInRange(sampleValidBinarySearchTreeData, 3,15){
        println(it.data)
    };
}
