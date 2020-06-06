package io.github.abitgen.leetcode.challenge30.twenty20April._19_searchRotatedSortedArray

object SearchRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1
        val maxNumIndex = findLargestNumIndex(nums, 0, nums.size - 1)

        if (target >= nums[0] && target <= nums[maxNumIndex]) return modBSearch(nums, target, 0, maxNumIndex)
        else return modBSearch(nums, target, maxNumIndex + 1, nums.size - 1)
    }

    private fun modBSearch(nums: IntArray, target: Int, left: Int, right: Int): Int {
        val mid = (left + right) / 2
        if (left > nums.size - 1 || right < 0) return -1
        if (target == nums[mid]) return mid
        if (target == nums[left]) return left
        if (target == nums[right]) return right
        val index = nums.binarySearch(target, left, right)
        return if (index < 0) -1 else index
    }

    private fun findLargestNumIndex(nums: IntArray, left: Int, right: Int): Int {
        val mid = (left + right) / 2
        println("$left $mid $right")
        if(mid-1 <0 || mid+1 >right) return mid
        return if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) mid
        else if (nums[left] > nums[mid]) findLargestNumIndex(nums, left, mid - 1)
        else if (nums[mid] < nums[mid+1]) findLargestNumIndex(nums, mid + 1, right)
        else mid
    }
}

fun main() {
    //println(SearchRotatedSortedArray.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
    println(SearchRotatedSortedArray.search(intArrayOf(4, 5, 6, 7, 8, 9,10, 1, 2, 3), 8))
    println("~~~~~~~~~~~~~~~~~")
    println(SearchRotatedSortedArray.search(intArrayOf(4, 5, 6, 7, 8, 9,10, 1, 2, 3), 2))
    println("~~~~~~~~~~~~~~~~~")
    println(SearchRotatedSortedArray.search(intArrayOf(3), 2))
    println("~~~~~~~~~~~~~~~~~")
    println(SearchRotatedSortedArray.search(intArrayOf(3), 3))


}