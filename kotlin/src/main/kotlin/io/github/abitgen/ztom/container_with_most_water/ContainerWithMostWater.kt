package io.github.abitgen.ztom.container_with_most_water

import kotlin.math.max
import kotlin.math.min
import kotlin.system.measureTimeMillis

sealed interface MaxArea {
    fun maxArea(height: IntArray): Int
}

sealed class ContainerWithMostWater : MaxArea {

    fun calculateWaterOccupied(height: IntArray, i: Int, j: Int): Int {
        val distance = j - i
        val heightOccupied = min(height[i], height[j])
        return distance * heightOccupied
    }
}

object BruteForceSolution : ContainerWithMostWater() {
    override fun maxArea(height: IntArray): Int {

        var maxArea = 0

        for (i in height.indices) {
            for (j: Int in i + 1 until height.size) {
                maxArea = max(calculateWaterOccupied(height, i, j), maxArea)
            }
            println()
        }
        return maxArea
    }
}

object OptimizedSolution : ContainerWithMostWater() {
    override fun maxArea(height: IntArray): Int {

        var maxArea = 0
        var p1 = 0
        var p2 = height.size - 1

        while(p1 < p2){
            maxArea = max(calculateWaterOccupied(height, p1, p2), maxArea)

            /**
             * Determine if there exists a value in other indexes after start and before end index which may result in higher maxArea.
             */
            if(height[p1] < height[p2] ){
                p1++
            }
            else {
                p2--
            }
        }
        return maxArea

    }
}



fun execute(executor: MaxArea, input: IntArray) {
    val measuredTime = measureTimeMillis {
        val maxArea = executor.maxArea((input))
        println("Max Area is : $maxArea units")
    }
    println("Measured time is : $measuredTime ms")

}

fun main() {
    val input = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    execute(BruteForceSolution, input)
    execute(OptimizedSolution, input)
}