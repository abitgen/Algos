package io.github.abitgen.leetcode.challenge30.twenty20April._19_searchRotatedSortedArray

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class TestSearchRotatedSortedArray {

    @Test
    fun `empty array`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(), 3), `is`(-1))
    }

    @Test
    fun `positive one element array`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(4), 4), `is`(0))
    }

    @Test
    fun `negative one element array`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(4), 3), `is`(-1))
    }

    @Test
    fun `positive Two elements array`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(1,3), 3), `is`(1))
    }

    @Test
    fun `negative Two elements array`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(1,3), 0), `is`(-1))
    }

    @Test
    fun `positive Sorted array without rotation`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(1,2,3,4,5,6), 4), `is`(3))
    }

    @Test
    fun `negative Sorted array without rotation`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(1,3), 2), `is`(-1))
    }

    @Test
    fun `negative Sorted array without rotation 3 elements`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(1,3,5), 4), `is`(-1))
    }

    @Test
    fun `positive Rotated array 1`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(4,5,6,7,8,1,2,3), 8), `is`(4))
    }

    @Test
    fun `positive rotated array more than 100 elements`(){
        assertThat(SearchRotatedSortedArray.search(intArrayOf(57,58,59,62,63,66,68,72,73,74,75,76,77,78,80,81,86,
            95,96,97,98,100,101,102,103,110,119,120,121,123,125,126,127,132,136,144,145,148,149,151,152,160,161,
            163,166,168,169,170,173,174,175,178,182,188,189,192,193,196,198,199,200,201,202,212,218,219,220,224,
            225,229,231,232,234,237,238,242,248,249,250,252,253,254,255,257,260,266,268,270,273,276,280,281,283,
            288,290,291,292,294,295,298,299,4,10,13,15,16,17,18,20,22,25,26,27,30,31,34,38,39,40,47,53,54), 30), `is`(113))
    }
}