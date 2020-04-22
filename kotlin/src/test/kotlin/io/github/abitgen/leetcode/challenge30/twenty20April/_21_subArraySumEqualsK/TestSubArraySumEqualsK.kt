package io.github.abitgen.leetcode.challenge30.twenty20April._21_subArraySumEqualsK

import io.github.abitgen.leetcode.challenge30.twenty20April._22_subarraySumEqualsK.SubArraySumEqualsK
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class TestSubArraySumEqualsK {
    @Test
    fun some() {
        assertThat( SubArraySumEqualsK.subarraySum(intArrayOf(1, 1, 1), 2), `is`(2))
    }
}