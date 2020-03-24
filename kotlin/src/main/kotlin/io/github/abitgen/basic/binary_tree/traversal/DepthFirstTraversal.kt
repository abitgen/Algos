package io.github.abitgen.basic.binary_tree.traversal

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


fun main(){
    val rootNode = sampleBinaryTreeCharData

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