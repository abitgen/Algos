package io.github.abitgen.basic.binary_tree.traversal

import java.util.*

class BreadthFirstTraversal {
    val queue: Deque<IntNode> = LinkedList<IntNode>()

    fun bftPrint(rootNode: IntNode) {
        bft(rootNode, ::println)
    }

    fun bftSquare(rootNode: IntNode) {
        bft(rootNode){
            println(it*it)
        }
    }

    private fun <T> bft(rootNode: IntNode, process:(Int)->T) {
        queue.add(rootNode)
        while (queue.isNotEmpty()) {
            val intnode = queue.removeFirst()

            process(intnode.data)

            intnode.leftNode?.let {
                queue.add(intnode.leftNode)
            }
            intnode.rightNode?.let {
                queue.add(intnode.rightNode)
            }
        }
    }
}

fun main() {
    val rootNode = sampleBinaryTreeIntData
    val bft = BreadthFirstTraversal()

    bft.bftPrint(rootNode)
    println()
    bft.bftSquare(rootNode)
}





