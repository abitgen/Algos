package io.github.abitgen.basic.binary_tree.traversal

import io.github.abitgen.basic.binary_tree.BinaryNode

typealias CharNode = BinaryNode<Char>

class DepthFirstTraversal {

    fun dftPreOrderPrint(node: CharNode?){
        dftPreOrder(node, ::print)
    }

    fun dftInOrderPrint(node: CharNode?){
        dftInOrder(node, ::print)
    }

    fun dftPostOrderPrint(node: CharNode?){
        dftPostOrder(node, ::print)
    }

    private fun <T> dftPreOrder(node: CharNode?, process:(Char)->T) {
        if(node == null) return
        process(node.data)
        dftPreOrder(node.leftNode, process)
        dftPreOrder(node.rightNode, process)
    }

    private fun <T> dftInOrder(node: CharNode?, process:(Char)->T) {
        if(node == null) return
        dftInOrder(node.leftNode, process)
        process(node.data)
        dftInOrder(node.rightNode, process)
    }

    private fun <T> dftPostOrder(node: CharNode?, process:(Char)->T) {
        if(node == null) return
        dftPostOrder(node.leftNode, process)
        dftPostOrder(node.rightNode, process)
        process(node.data)
    }
}

/**
 * rotate the code rootNode to 90 deg to get a below tree diagram.
 * Each indentation refers to each increasing level.
 * rightNode is the second parameter, leftNode is the last one, to get the tree as shown.
 *
 *                   A
 *                /    \
 *               E      B
 *              / \    / \
 *             -  F   D  C
 *               / \
 *              J  G
 *                / \
 *               I  H
 */
fun main(){
    val rootNode =
        CharNode(
        'A',
            CharNode(
                'B',
                CharNode('C'),
                CharNode('D')),
            CharNode(
                'E',
                CharNode(
                    'F',
                    CharNode('G',
                        CharNode('H'),
                        CharNode('I')),
                    CharNode('J'))))

    val dft = DepthFirstTraversal()
    println(">>>>>>> Pre Order")
    dft.dftPreOrderPrint(rootNode)
    println()
    println(">>>>>>> In Order")
    dft.dftInOrderPrint(rootNode)
    println()
    println(">>>>>>> Post Order")
    dft.dftPostOrderPrint(rootNode)

}