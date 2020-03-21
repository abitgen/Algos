package io.github.abitgen.basic.binary_tree

import io.github.abitgen.basic.binary_tree.traversal.IntNode

class BinaryNode<T>(val data:T, var leftNode: BinaryNode<T>?=null, var rightNode:BinaryNode<T>?=null) {
    internal fun setLeft(left: BinaryNode<T>){
        this.leftNode = left
    }

    internal fun setRight(right: BinaryNode<T>){
        this.rightNode = right
    }
}
/*
fun IntNode.left(left:Int): BinaryNode<Int> {
    setLeft(IntNode(left))
    return this
}

fun IntNode.right(right: Int): BinaryNode<Int> {
    setRight(IntNode(right))
    return this
}

fun IntNode.lleft(left:Int): BinaryNode<Int>? {
    leftNode?.setLeft(IntNode(left))
    return leftNode
}

fun IntNode.lright(right: Int): BinaryNode<Int>? {
    leftNode?.setRight(IntNode(right))
    return leftNode
}

fun IntNode.rleft(left:Int): BinaryNode<Int>? {
    rightNode?.setLeft(IntNode(left))
    return rightNode
}

fun IntNode.rright(right: Int): BinaryNode<Int>? {
    rightNode?.setRight(IntNode(right))
    return rightNode
}

infix fun <T> BinaryNode<T>.level(level: Int):IntNode? {
    return null
}

fun <T> BinaryNode<T>?.next(right: Any): Any {

}

  IntNode(0).left(1).right(2).level(1)
                         ?.left(3)?.right(4).next().left(5)?.right(6).level(2)

                         */
