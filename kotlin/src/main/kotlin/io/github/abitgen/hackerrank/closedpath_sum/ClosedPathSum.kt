package io.github.abitgen.hackerrank.closedpath_sum

class ClosedPathSum {
}


/*
 * Complete the 'closedPaths' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER number as parameter.
 */

fun closedPaths(number: Int): Int {
    // Write your code here
    val map = hashMapOf<Int, Int>(
        0 to 1,
        1 to 0,
        2 to 0,
        3 to 0,
        4 to 1,
        5 to 0,
        6 to 1,
        7 to 0,
        8 to 2,
        9 to 1
    );
    var outputSum = 0
    val numList = number.toString().map { ("$it").toInt() }
    numList.forEach {
        outputSum += map.getOrElse(it, {0})
    }
    return outputSum
}

fun main(args: Array<String>) {
    print(closedPaths(630))
}