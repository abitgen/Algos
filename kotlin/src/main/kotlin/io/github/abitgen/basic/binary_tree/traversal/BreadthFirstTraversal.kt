package io.github.abitgen.basic.binary_tree.traversal

import io.github.abitgen.basic.binary_tree.*
import java.util.*

typealias IntNode = BinaryNode<Int>

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
    val rootNode = IntNode(
        0,
        IntNode(
            1,
            IntNode(3),
            IntNode(99)),
        IntNode(
            2,
            IntNode(
                4,
                IntNode(5),
                IntNode(6)))
    )

    val bft = BreadthFirstTraversal()

    bft.bftPrint(rootNode)
    println()
    bft.bftSquare(rootNode)
}





