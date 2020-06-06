package io.github.abitgen.leetcode.challenge30.twenty20May._8_checkIfItIsAStraightLine

object CheckPointsAreInStraightLine {

    private fun findEquation(pointA: Pair<Int, Int>, pointB: Pair<Int, Int>): Pair<Int, Int> {
        var a =  pointB.first - pointA.first
        var b =  pointB.second - pointA.second
        val slope = if(a != 0) b/a else b
        val constant = pointA.second - slope*pointA.first //  b = y - mx
        return Pair(constant,slope);
    }

    private fun arrToPair(intArr:IntArray): Pair<Int, Int> {
        return Pair(intArr[0], intArr[1])
    }


    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        if(coordinates.size <= 2) return true
        val equationPair = findEquation( arrToPair(coordinates[0]), arrToPair(coordinates[1]))
        for (coordinate in coordinates){
            val coord = arrToPair(coordinate)
            if(coord.second != equationPair.second*coord.first + equationPair.first)
                return false
        }
        return true
    }
}

fun main(){
    println(CheckPointsAreInStraightLine.checkStraightLine(
        arrayOf(intArrayOf(1,2),
            intArrayOf(2,3),
            intArrayOf(3,4),
            intArrayOf(4,5),
            intArrayOf(5,6),
            intArrayOf(6,7))
    ))
}