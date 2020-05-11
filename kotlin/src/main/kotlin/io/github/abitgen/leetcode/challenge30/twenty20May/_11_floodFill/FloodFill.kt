package io.github.abitgen.leetcode.challenge30.twenty20May._11_floodFill

object FloodFill {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        return if(image.isNotEmpty() && image[0].isNotEmpty()) {
            val originalColor = image[sr][sc]
            if(originalColor == newColor)
            else recurFill(image, sr, sc, originalColor, newColor)
            image
        }else
            image
    }

    fun recurFill(image: Array<IntArray>, sr: Int, sc: Int, originalColor : Int, newColor: Int): Array<IntArray>{
        if(sr !in image.indices || sc !in image[0].indices) return image
        if(image[sr][sc] == originalColor) {
            image[sr][sc] = newColor
            recurFill(image, sr + 1, sc, originalColor, newColor)
            recurFill(image, sr - 1, sc, originalColor, newColor)
            recurFill(image, sr, sc + 1, originalColor, newColor)
            recurFill(image, sr, sc - 1, originalColor, newColor)
        }
        return image
    }
}

fun main() {
    println(
        FloodFill.floodFill(
            arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1)),
            1,
            1,
            2
        ).forEach {
            println(it.joinToString())
        }
    )
}