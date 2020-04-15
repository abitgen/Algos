package io.github.abitgen.leetcode.challenge30.twenty20April._14_performStringShifts

object PerformStringShifts {
    fun stringShift(s: String, shift: Array<IntArray>): String {
        var shiftedString = s
        for (group in shift) {
            val shiftSize = if (group[1] > s.length)
                                group[1] % s.length
                            else
                                group[1]

            //Left shift
            if (group[0] == 0) {
                shiftedString = shiftLeft(shiftedString, shiftSize)
            }

            //Right Shift
            else if (group[0] == 1) {
                shiftedString = shiftRight(shiftedString, shiftSize)
            }

        }
        return shiftedString
    }

    private fun shiftLeft(s: String, moveSize: Int): String {
        val firstSubStr = s.substring(moveSize until s.length)
        val secondSubStr = s.substring(0 until moveSize)
        return firstSubStr + secondSubStr
    }

    private fun shiftRight(s: String, moveSize: Int): String {
        val firstSubStr = s.substring(s.length - moveSize until s.length)
        val secondSubStr = s.substring(0 until s.length - moveSize)
        return firstSubStr + secondSubStr
    }
}


fun main() {
    println(PerformStringShifts.stringShift("samsung", arrayOf(intArrayOf(0, 0), intArrayOf(1, 10))))
}