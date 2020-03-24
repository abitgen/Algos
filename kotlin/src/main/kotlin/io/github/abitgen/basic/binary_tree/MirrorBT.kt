package io.github.abitgen.basic.binary_tree

import io.github.abitgen.basic.binary_tree.traversal.sampleBinaryTreeCharData

class MirrorBT {
    fun mirrorTree(node: BinaryNode<Char>?) : BinaryNode<Char>? {

        if(node == null) return null
        val mirrorNode = BinaryNode(node.data)

        if(node.leftNode!=null)
            mirrorNode.rightNode = mirrorTree(node.leftNode)

        if(node.rightNode!=null)
            mirrorNode.leftNode = mirrorTree(node.rightNode)

        return mirrorNode

    }
}

fun main(){
    val mirrorBT : MirrorBT = MirrorBT()
    val mirrorNode = mirrorBT.mirrorTree(sampleBinaryTreeCharData)
}