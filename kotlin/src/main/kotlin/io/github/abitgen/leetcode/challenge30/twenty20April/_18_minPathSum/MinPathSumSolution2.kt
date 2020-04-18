package io.github.abitgen.leetcode.challenge30.twenty20April._18_minPathSum

 class MinPathSumSolution2 {
    lateinit var g: Array<IntArray>
    lateinit var dp: Array<IntArray>
    var x = 0
    var y = 0

     /**
      *  Leetcode solution provided by community - 172ms
      */
    fun minPathSum(grid: Array<IntArray>): Int {
        g = grid
        y = grid.size
        if (y == 0) return 0
        x = grid[0].size
        dp = Array(y) { IntArray(x) }
        // fill value with -1
        for (i in dp.indices) {
            for (j in dp[0].indices) dp[i][j] = -1
        }
        return recursion(0, 0)
    }

    private fun recursion(i: Int, j: Int): Int {
        if (i >= y || j >= x) return Int.MAX_VALUE
        if (i == y - 1 && j == x - 1) return g[i][j]
        if (dp[i][j] != -1) return dp[i][j]
        val sum = g[i][j] + Math.min(recursion(i + 1, j), recursion(i, j + 1))
        dp[i][j] = sum
        return sum
    }
}
