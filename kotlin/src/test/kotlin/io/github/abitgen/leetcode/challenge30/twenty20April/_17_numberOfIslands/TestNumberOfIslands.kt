package io.github.abitgen.leetcode.challenge30.twenty20April._17_numberOfIslands

import org.hamcrest.Matcher
import org.junit.Assert.assertThat
import org.hamcrest.CoreMatchers.*
import org.junit.Test

class TestNumberOfIslands {

    @Test
    fun `Number of Islands should be 3`(){
        assertThat(NumberOfIslands.numIslands(arrayOf(
            charArrayOf('1','1','0','0','0'),
            charArrayOf('1','1','0','0','0'),
            charArrayOf('0','0','1','0','0'),
            charArrayOf('0','0','0','1','1'))), `is`(3))
    }
}
