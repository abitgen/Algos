import kotlin.math.max
import kotlin.math.min
import kotlin.system.measureTimeMillis

sealed interface TrapWater {
    fun trapWater(height: IntArray): Int
}

sealed class TrappingRainWater : TrapWater {

    fun calculateWaterTrapped(currentHeight: Int, maxLeft: Int, maxRight: Int): Int {
        val heightOccupied = min(maxLeft, maxRight) - currentHeight
        return heightOccupied
    }
}

object BruteForceSolution : TrappingRainWater() {
    override fun trapWater(height: IntArray): Int {

        var totalWater = 0
        for (i in height.indices) {
            var pLeft = i
            var pRight = i
            var maxLeft = 0
            var maxRight = 0

            while (pLeft > 0) {
                maxLeft = max(maxLeft, height[pLeft])
                pLeft--
            }

            while (pRight < height.size) {
                maxRight = max(maxRight, height[pRight])
                pRight++
            }

            if (maxLeft == 0 || maxRight == 0) {

            } else {
                var trappedWaterAtAPoint = calculateWaterTrapped(height[i], maxLeft, maxRight)
                if (trappedWaterAtAPoint > 0) {
                    totalWater += trappedWaterAtAPoint
                }
            }
        }
        return totalWater
    }
}

object OptimizedSolution1 : TrappingRainWater() {
    override fun trapWater(height: IntArray): Int {
        var totalWater = 0
//        for (i in height.indices) {
        var pLeft = 0
        var pRight = height.size - 1
        val length = height.size - 1
        var maxLeft = 0
        var maxRight = 0
        var map = hashMapOf<Int, Pair<Int,Int>>()

        while(pLeft <= height.size-1 && pRight >= 0){

            if(map[pLeft] == null && map[pRight] == null) {
                if(pLeft == pRight){
                    map[pLeft] = Pair(max(maxLeft, height[pLeft]), max(maxRight, height[pRight]))

                }else{
                    map[pLeft] = Pair(max(maxLeft, height[pLeft]), -1)
                    map[pRight] = Pair(-1, max(maxRight, height[pRight]))
                }
            }
            else{
                map[pLeft] = Pair(max(maxLeft, height[pLeft]), map[pLeft]?.second!!)
                map[pRight] = Pair(map[pRight]?.first!!, max(maxRight, height[pRight]))
            }
            maxLeft = map[pLeft]?.first!!
            maxRight = map[pRight]?.second!!
            pLeft++
            pRight--
        }

        for(i in height.indices){
            val trappedWaterAtPoint = calculateWaterTrapped(height[i], map[i]?.first!!, map[i]?.second!!)
            if(trappedWaterAtPoint > 0)
                totalWater +=trappedWaterAtPoint
        }
        return totalWater;
    }
}

object OptimizedSolution2 : TrappingRainWater() {
    override fun trapWater(height: IntArray): Int {

        // Indices to traverse the array
        var pLeft = 0
        var pRight = height.size - 1

        // To store Left max and right max
        // for two pointers left and right
        var maxLeft = 0
        var maxRight = 0

        // To store the total amount
        // of rain water trapped
        var totalWater = 0


        while(pLeft <= pRight){
            // Always taking the moving pointer to the side which has lesser value
            if(height[pLeft] <= height[pRight]){

                // There is no maxRight here, because the height of the right wall doesn't affect the calculation of water trapped
                // Because it is at least higher than the wall at left
                // So difference in value at current pointer to the maxLeft should give water trapped at that point
                // Sum it to totalWater
                totalWater += max(0, maxLeft - height[pLeft])

                // updating maxLeft with the previously stored value.
                maxLeft = max(maxLeft, height[pLeft])

                //increment left pointer
                pLeft++
            }else{

                // There is no maxLeft here, because the height of the left wall doesn't affect the calculation of water trapped
                // Because it is at least higher than the wall at right
                // So difference in value at current pointer to the maxRight should give water trapped at that point
                // Sum it to totalWater
                totalWater += max(0, maxRight - height[pRight])

                // updating maxRight with the previously stored value.
                maxRight = max(maxRight, height[pRight])

                //increment right pointer
                pRight--
            }
        }

        return totalWater
    }
}
fun execute(executor: TrapWater, input: IntArray) {
    val measuredTime = measureTimeMillis {
        val totalWater = executor.trapWater((input))
        println("Total Water trapped is : $totalWater units")
    }
    println("Measured time is : $measuredTime ms")

}

fun main() {
    val input = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
    execute(BruteForceSolution, input)
    execute(OptimizedSolution1, input)
    execute(OptimizedSolution2, input)

}
