package io.github.abitgen.leetcode.challenge30.twenty20April._18_minPathSum

object MinPathSum {
    fun minPathSum(grid: Array<IntArray>): Int {
        val visitedMap: HashMap<Pair<Int, Int>, Int> = hashMapOf()
        val copyGrid = Array(grid.size){
            IntArray(grid[0].size){ -1 }
        }
        //findNextMin(grid, visitedMap,0, 0)
        return findNextMin3(grid, copyGrid,0, 0)
    }

    /**
     *  My Solution Using Map for Dynamic Programming Memoization - Leetcode time 868ms
     */
    private fun findNextMin(grid: Array<IntArray>, map: HashMap<Pair<Int, Int>, Int>, i: Int, j: Int): Int {

        // Reached last element {n,p} and cannot proceed further
        if (i == grid.size - 1 && j == grid[0].size - 1) return grid[i][j];
        //print(" $min >")


        if(map[Pair(i,j)]!=null){
            return /*grid[i][j] +*/ map[Pair(i,j)]!!
        }

        //On reach of either row end or column end in matrix
        if (i == grid.size - 1) {
            return grid[i][j] + assignAndGetFromMap(grid, map, i,j+1)
        } else if (j == grid[0].size - 1) {
            return grid[i][j] + assignAndGetFromMap(grid, map, i+1,j)
        }

        //When traversing in other areas of the matrix
        return grid[i][j] + kotlin.math.min(assignAndGetFromMap(grid, map, i,j+1) , assignAndGetFromMap(grid, map, i+1,j))
    }

    private fun assignAndGetFromMap(grid: Array<IntArray>, visitedMap: HashMap<Pair<Int, Int>, Int>, i: Int, j: Int): Int {
        val pair = Pair(i,j)
        visitedMap[pair] = findNextMin(grid, visitedMap, i, j)
        return visitedMap.getOrDefault(pair, 0)
    }

    /**
     *  My Solution Using Array for Dynamic Programming Memoization - Leetcode time 360ms
     */
    private fun findNextMin2(grid: Array<IntArray>, copyGrid: Array<IntArray>, i: Int, j: Int): Int {

        // Reached last element {n,p} and cannot proceed further
        if (i == grid.size - 1 && j == grid[0].size - 1) return grid[i][j];

        if(copyGrid[i][j]!=-1){
            return copyGrid[i][j]
        }

        //On reach of either row end or column end in matrix
        if (i == grid.size - 1) {
            return grid[i][j] + assignAndGetFromArray(grid, copyGrid, i,j+1)
        } else if (j == grid[0].size - 1) {
            return grid[i][j] + assignAndGetFromArray(grid, copyGrid, i+1,j)
        }

        //When traversing in other areas of the matrix
        return grid[i][j] + kotlin.math.min(assignAndGetFromArray(grid, copyGrid, i,j+1) , assignAndGetFromArray(grid, copyGrid, i+1,j))
    }

    /**
     * An optimized version of findNextMin2 method
     */
    private fun findNextMin3(grid: Array<IntArray>, copyGrid: Array<IntArray>, i: Int, j: Int): Int {

        //if both i,j are out of bounds, the min value returned will be Integer.MAX_VALUE + Something (which will overflow).
        if( i>= grid.size || j >= grid[0].size)
            return Integer.MAX_VALUE

        // Reached last element {n,p} and cannot proceed further
        if (i == grid.size - 1 && j == grid[0].size - 1)
            return grid[i][j];

        // If already traversed get it from the array element stored previously
        if(copyGrid[i][j]!=-1)
            return copyGrid[i][j]

        val sum = grid[i][j] + kotlin.math.min(findNextMin3(grid, copyGrid, i,j+1) , findNextMin3(grid, copyGrid, i+1,j))
        copyGrid[i][j] = sum
        return sum
    }

    private fun assignAndGetFromArray(grid: Array<IntArray>, copyGrid: Array<IntArray>, i: Int, j: Int): Int {
        copyGrid[i][j] = findNextMin2(grid, copyGrid, i, j)
        return copyGrid[i][j]
    }

    /**
     *  My solution without using Dynamic Programming. Leetcode submission resulted in Time limit exceeded
     */
    private fun findNextMin4(grid: Array<IntArray>, i: Int, j: Int): Int {

        // Reached last element {n,p} and cannot proceed further
        if (i == grid.size - 1 && j == grid[0].size - 1) return grid[i][j];
        //print(" $min >")


        //On reach of either row end or column end in matrix
        if (i == grid.size - 1) {
            return grid[i][j] + findNextMin4(grid, i, j + 1)
        } else if (j == grid[0].size - 1) {
            return grid[i][j] + findNextMin4(grid, i + 1, j)
        }

         if (grid[i][j + 1] == grid[i + 1][j]) {
             return grid[i][j] + kotlin.math.min(findNextMin4(grid, i, j + 1), findNextMin4(grid, i + 1, j))
         }

        //When traversing in other areas of the matrix
        val (b, c) = if (grid[i][j + 1] < grid[i + 1][j]) Pair(i, j + 1) else Pair(i + 1, j)
        return grid[i][j] + kotlin.math.min(findNextMin4(grid, i, j + 1), findNextMin4(grid, i + 1, j))
    }
}

fun main() {
    println(
        MinPathSum.minPathSum(
            arrayOf(
                intArrayOf(1, 3, 1),
                intArrayOf(1, 5, 1),
                intArrayOf(4, 2, 1)
            )
        )
    )

    println(MinPathSum.minPathSum(arrayOf(intArrayOf(9,1,4,8))))
}