package io.github.abitgen.leetcode.challenge30.twenty20May._7_cousinsInBT

import io.github.abitgen.leetcode.common.TreeNode
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class TestCousinsInBT {

    @Test
    fun `test example 1 `() {
        assertThat(CousinsInBT.isCousins(
            TreeNode(1).apply {
                right = TreeNode(3)
                left = TreeNode(2).apply {
                    left = TreeNode(4)
                }
            }, 4 , 3), `is`(false))
    }

    @Test
    fun `test example 2 `() {
        assertThat(CousinsInBT.isCousins(
            TreeNode(1).apply {
                right = TreeNode(3).apply {
                    right = TreeNode(5)
                }
                left = TreeNode(2).apply {
                    right = TreeNode(4)
                }
            }, 5 , 4), `is`(true))
    }

    @Test
    fun `test example 3 `() {
        assertThat(CousinsInBT.isCousins(
            TreeNode(1).apply {
                right = TreeNode(3)
                left = TreeNode(2).apply {
                    right = TreeNode(4)
                }
            }, 2 , 3), `is`(false))
    }
}


