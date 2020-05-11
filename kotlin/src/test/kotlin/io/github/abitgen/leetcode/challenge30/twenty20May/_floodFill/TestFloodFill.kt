package io.github.abitgen.leetcode.challenge30.twenty20May._floodFill

import io.github.abitgen.leetcode.challenge30.twenty20May._11_floodFill.FloodFill
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class TestFloodFill {

    @Test
    fun `test 1`(){
        assertThat(FloodFill.floodFill(
            arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1)),
            1,
            1,
            2
        ), `is`(
            arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1))
        ))
    }

    @Test
    fun `test 2 - Original and New Color are same`(){
        assertThat(FloodFill.floodFill(
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 1)),
            1,
            1,
            1
        ), `is`(
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 1))
        ))
    }
}