package io.github.abitgen.leetcode.common

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "Node $`val` -> $next"
    }
}