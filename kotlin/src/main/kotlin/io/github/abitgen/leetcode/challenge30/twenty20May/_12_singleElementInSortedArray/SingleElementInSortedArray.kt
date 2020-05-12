package io.github.abitgen.leetcode.challenge30.twenty20May._12_singleElementInSortedArray

object SingleElementInSortedArray {
    fun singleNonDuplicate(nums: IntArray): Int {
        return nums[search(nums)]
    }

    /**
     * My solution - leetcode time - 196ms
     */
    private fun search(nums: IntArray): Int {
        var start: Int = 0
        var end: Int = nums.size - 1
        var mid: Int = -1
        loop@ while (start < end) {
            val size = start + end + 1 // +1 because start is 0, end is num.size-1
            mid = size / 2

            // --->NOTE : mid is index, so a mid of index 4 will have 5 elements till mid inclusive,
            // mid % 2 == 0 means Odd Number of elements, else even number
            if (mid % 2 == 0) { //There are Odd Number Of Elements From Start to Mid Index, So element exists before mid

                if (nums[mid - 1] == nums[mid])
                // Previous to mid(mid-1) and the mid index values do match remove it from the range
                // Not considering last (mid-1, mid) pair, so -2,
                // And hence element is in left side of mid
                    end = mid - 2

                else
                // If mid-1 and mid are not equal
                // How you ask? Odd Number Of elements before mid, so there will be all pairs except for one addition element, which is mid.
                // ANd of course it wont be equal to mid-1
                // all pairs before mid satisfy
                // And hence element is in right side of mid
                    start = mid

            } else { //There are Even Number Of Elements From Start to Mid Index, So element exists after mid

                if (nums[mid - 1] == nums[mid])
                // Previous to mid and the mid index values do match
                // mid + 1 because the pair till (mid-1,mid) is satisfied. so starting from mid+1
                // And hence element is in right side of mid
                    start = mid + 1

                else
                // As there are even number of elements before mid, If mid-1 and mid are not equal.
                // mid - 1 because the pair till (mid, mid+1) is satisfied from the end.
                // And hence element is in left side of mid
                    end = mid - 1
            }
        }
        return start
    }

    /**
     *  Other solution
     */
    fun singleNonDuplicate2(nums: IntArray): Int {
        var start = 0
        var end = nums.size - 1
        while (start < end) {
            // We want the first element of the middle pair,
            // which should be at an even index if the left part is sorted.
            // Example:
            // Index: 0 1 2 3 4 5 6
            // Array: 1 1 3 3 4 8 8
            //            ^
            var mid = (start + end) / 2
            if (mid % 2 == 1) mid--
            // We didn't find a pair. The single element must be on the left.
            // (pipes mean start & end)
            // Example: |0 1 1 3 3 6 6|
            //               ^ ^
            // Next:    |0 1 1|3 3 6 6
            if (nums[mid] != nums[mid + 1]) end = mid else start = mid + 2
        }
        // 'start' should always be at the beginning of a pair.
        // When 'start > end', start must be the single element.
        return nums[start]
    }
}

fun main() {
    println(SingleElementInSortedArray.singleNonDuplicate(intArrayOf(1, 1, 2, 3, 3, 4, 4, 8, 8))) //2
    println(SingleElementInSortedArray.singleNonDuplicate(intArrayOf(3, 3, 7, 7, 10, 11, 11))) // 10
    println(SingleElementInSortedArray.singleNonDuplicate(intArrayOf(1, 1, 2, 3, 3))) // 2

}