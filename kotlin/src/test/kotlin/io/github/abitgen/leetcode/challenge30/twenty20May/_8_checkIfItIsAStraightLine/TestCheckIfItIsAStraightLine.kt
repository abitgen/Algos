package io.github.abitgen.leetcode.challenge30.twenty20May._8_checkIfItIsAStraightLine

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class TestCheckIfItIsAStraightLine {

    @Test
    fun `test 1 - should be true`() {
        assertThat(
            CheckPointsAreInStraightLine.checkStraightLine(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(3, 4),
                    intArrayOf(4, 5),
                    intArrayOf(5, 6),
                    intArrayOf(6, 7)
                )
            ), `is`(true)
        )
    }

    @Test
    fun `test 2 - should be true`() {
        assertThat(
            CheckPointsAreInStraightLine.checkStraightLine(
                arrayOf(
                    intArrayOf(-7, -3),
                    intArrayOf(-7, -1),
                    intArrayOf(-2, -2),
                    intArrayOf(0, -8),
                    intArrayOf(2, -2),
                    intArrayOf(5, -6),
                    intArrayOf(5, -5),
                    intArrayOf(1, 7)
                )
            ), `is`(false)
        )
    }
}