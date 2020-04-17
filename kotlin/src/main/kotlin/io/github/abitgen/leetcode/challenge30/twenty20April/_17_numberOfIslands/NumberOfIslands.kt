package io.github.abitgen.leetcode.challenge30.twenty20April._17_numberOfIslands

import java.util.*

object NumberOfIslands {
    fun numIslands(grid: Array<CharArray>): Int {
        val copyGrid: Array<IntArray> = Array(grid.size) { index ->
            grid[index].map { it.toString().toInt() }.toIntArray()
        }

        val countSet = hashSetOf<Pair<Int, Int>>()
        val visitedMap = hashMapOf<Pair<Int, Int>, Pair<Int, Int>>()
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if(grid[i][j] == '0') continue
                if (visitedMap[Pair(i, j)] == null)
                    groupSides(grid, countSet, visitedMap, Pair(i, j), i, j)
            }
        }
        return countSet.size
    }

    private fun groupSides(
        grid: Array<CharArray>,
        countSet: HashSet<Pair<Int, Int>>,
        visitedMap: HashMap<Pair<Int, Int>, Pair<Int, Int>>,
        groupId: Pair<Int, Int>,
        i: Int,
        j: Int
    ) {

        /**
         * If already visited returning
         */
        if(visitedMap[Pair(i,j)]!=null) return

        if (grid[i][j] == '1') {
            countSet.add(groupId)
            visitedMap.putIfAbsent(Pair(i, j), groupId)
        }

        if (i - 1 >= 0 && grid[i - 1][j] == '1')
            groupSides(grid, countSet, visitedMap, groupId, i - 1, j)
        if (j - 1 >= 0 && grid[i][j - 1] == '1')
            groupSides(grid, countSet, visitedMap, groupId, i, j - 1)

        if (i+1 <= grid.size - 1 && grid[i + 1][j] == '1')
            groupSides(grid, countSet, visitedMap, groupId, i + 1, j)
        if (j+1 <= grid[0].size - 1 && grid[i][j + 1] == '1')
            groupSides(grid, countSet, visitedMap, groupId, i, j + 1)

    }
}


fun main() {
    println(NumberOfIslands.numIslands(
        arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1')
        )
    ))
}