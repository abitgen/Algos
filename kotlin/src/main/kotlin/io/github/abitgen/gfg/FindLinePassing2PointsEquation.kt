package io.github.abitgen.gfg

import io.github.abitgen.gfg.FindLinePassing2PointsEquation.printEquation
import java.lang.Math.abs

//https://www.geeksforgeeks.org/program-find-line-passing-2-points/
object FindLinePassing2PointsEquation {

    /**
     * Using
     *
     * y = mx + b formula
     *
     *
     */
    fun findEquation( pointA: Pair<Int, Int>, pointB: Pair<Int, Int>): Pair<Int, Int> {
        var a =  pointB.first - pointA.first
        var b =  pointB.second - pointA.second
        val slope = if(a != 0) b/a else b
        val constant = pointA.second - slope*pointA.first //  b = y - mx
        return Pair(constant,slope);
    }

    fun printEquation(eq:Pair<Int,Int>){
        if(eq.first > 0)
            println("y = ${eq.second}x + ${eq.first}")
        else
            println("y = ${eq.second}x ${eq.first}")
    }

    fun hcf(n1:Int, n2:Int): Int {
        var num1 = kotlin.math.abs(n1);
        var num2 = kotlin.math.abs(n2);
        while (num1 != num2) {

            if(num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        return num1
    }
}

fun main(){
    val eq = FindLinePassing2PointsEquation.findEquation(Pair(1,4), Pair(3,8))
    printEquation(eq)
    val eq2 = FindLinePassing2PointsEquation.findEquation(Pair(3,8), Pair(5,12))
    printEquation(eq2)
}