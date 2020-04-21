package io.github.abitgen.leetcode.challenge30.twenty20April._21_leftmostColumnWithOne

import kotlin.math.sign

/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * class BinaryMatrix {
 *     fun get(x:Int, y:Int):Int {}
 *     fun dimensions():List<Int> {}
 * }
 */

interface BinaryMatrix {
    fun get(x: Int, y: Int): Int
    fun dimensions(): List<Int>
    fun set(arr: Array<IntArray>)
    fun getCount() : Int
}

class BinaryMatrixImpl(private var arr: Array<IntArray>? = null) : BinaryMatrix {
    var counter:Int =0
    override fun get(x: Int, y: Int): Int {
        counter++
        return arr!![x][y]
    }

    override fun set(arr: Array<IntArray>){
        this.arr = arr
    }

    override fun dimensions(): List<Int> {
        return listOf<Int>(arr!!.size, arr!!.getOrNull(0)?.size ?: 0)
    }

    override fun getCount() = counter
}


object LeftmostColumnWithOne {
    fun leftMostColumnWithOne(binaryMatrix: BinaryMatrix): Int {
        val dimens = binaryMatrix.dimensions()
        val xSize = dimens[0]
        val ySize = dimens[1]

        var leftIndex = Int.MAX_VALUE
        for(i in 0 until xSize){
            //if(binaryMatrix.get(i, 0) == 1) return 0
            leftIndex = kotlin.math.min(leftIndex, leftMostOneSearch(i, binaryMatrix, leftIndex,0, ySize-1))

            if(leftIndex == 0)
                break
        }

        println("Total Method calls : ${binaryMatrix.getCount()}")

        return if(leftIndex == Int.MAX_VALUE) -1 else leftIndex
    }

    private fun leftMostOneSearch(xIndex:Int, bm: BinaryMatrix, prevLeftIndex:Int, left:Int, right:Int): Int {

        if(left > prevLeftIndex) return prevLeftIndex

        val mid = (left+right) /2
        if(mid < left || mid > right) return Int.MAX_VALUE

        val midVal = bm.get(xIndex,mid)

        if(midVal == 0)
            return leftMostOneSearch(xIndex, bm, prevLeftIndex, mid+1, right)
        else {
            if(bm.get(xIndex, 0) == 1) return 0
            if(mid-1 >= 0 && bm.get(xIndex,mid-1) == 0) return mid
            return leftMostOneSearch(xIndex, bm, prevLeftIndex, left, mid - 1)
        }
    }
}

fun main() {
    println(LeftmostColumnWithOne.leftMostColumnWithOne(
        BinaryMatrixImpl(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(1, 1)
            )
        )
    ))
}