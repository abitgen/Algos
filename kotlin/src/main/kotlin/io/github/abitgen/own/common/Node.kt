package io.github.abitgen.own.common

class Node<T>(val data: T) {
    var next: Node<T>? = null
    override fun toString(): String {
        return "${data.toString()} -> ${next?.toString()}"
    }
}