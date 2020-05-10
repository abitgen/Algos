package io.github.abitgen.leetcode.challenge30.twenty20May._10_findTheTownJudge

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class TestFindTheTownJudge {

    /**
     *  This returns -1 because not everyone trusts 3.
     *  If there was (1,3) as well, then it would return 3
     */
    @Test
    fun `Test 1`() {
        assertThat( FindTheTownJudge.findJudge(3, arrayOf(
            intArrayOf(1,2),
            intArrayOf(2,3)
        )), `is`(-1))
    }

    @Test
    fun `Test 2`() {
        assertThat( FindTheTownJudge.findJudge(4, arrayOf(
            intArrayOf(1,3),intArrayOf(1,4),intArrayOf(2,3),intArrayOf(2,4),intArrayOf(4,3)
        )), `is`(3))
    }
}