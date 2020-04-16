package io.github.abitgen.leetcode.challenge30.twenty20April._16_validParenthesisString

import kotlin.math.max
import kotlin.math.min

object ValidParenthesisString {
    fun checkValidString1(s: String): Boolean {
        var i = 0
        if (s[0] == ')') return false

        var modStr = s

        while (i < s.length - 1) {
            if ((s[i] == '*' || s[i] == '(')
                && (s[i + 1] == '*' || s[i + 1] == ')')
            ) {
                i += 2
                continue
            }
            modStr += s[i]
            i++
        }

        val mid = modStr.length / 2
        var left = mid - 1
        var right = mid + 1

        var isValid = true
        while (left > -1 && right < s.length) {
            if ((s[left] == '*' || s[left] == '(')
                && (s[right] == '*' || s[right] == ')')
            ) {
                /*if(s[left] == '(' && s[right] == ')'){*/
                continue
            } else {
                isValid = false
                break
            }
        }
        return true
    }

    fun checkValidString2(s: String): Boolean {
        if (s.startsWith(")") || s.endsWith("(")) return false
        return recursiveCheckFirstLast(recursiveCheckOpenClose(s))
    }

    fun checkValidString(str: String): Boolean {

        val s = recursiveCheckOpenClose(str)
        if (s.isEmpty()) return true
        if (s[0] == ')' || s[s.length - 1] == '(') return false

        var openCount = 0
        var closeCount = 0
        var asteriskCount = 0

        for (i in s.indices) {
            when {
                s[i] == '(' -> openCount++
                s[i] == ')' -> closeCount++
                s[i] == '*' -> asteriskCount++
            }

            println("$openCount $closeCount $asteriskCount")

            if (openCount + asteriskCount < closeCount)
                return false

            if ( s[i] == ')'
                && (i + 1 < s.length && s[i + 1] == '(')
                || i == s.length - 1 ) {

                if (openCount < closeCount) {
                    openCount = min(closeCount, openCount + asteriskCount)
                } else if (closeCount < openCount) {
                    closeCount = min(openCount, closeCount + asteriskCount)
                }
                asteriskCount = 0

                println("~~~~")
                println(">> $openCount $closeCount $asteriskCount")
            }
        }
        return closeCount == openCount
    }


    private fun recursiveCheckOpenClose(s: String): String {
        println(">> $s")
        return if (!s.contains("()")) s
        else recursiveCheckOpenClose(s.replace("()", ""))
    }


    private fun recursiveCheckFirstLast(s: String): Boolean {
        println(">>> $s")
        return if (s.startsWith(")") || s.endsWith("(")) false
        else if (s == "*" || s.isEmpty()) true
        else if ((s.startsWith("(") || s.startsWith("*")) && (s.endsWith(")") || s.endsWith("*"))) recursiveCheckFirstLast(
            s.substring(1, s.length - 1)
        )
        else true
    }

}

fun main() {

    println("______________")
    println(ValidParenthesisString.checkValidString("())*(**(()))")) //false
    println("______________")
    println(ValidParenthesisString.checkValidString("(*()(())())())")) //true


//      println(ValidParenthesisString.checkValidString("(*) ** ((*()*)")) // true

    //"(()) ((()) () () (*)  (*() (()) ()) ()) ()() ((() ()) ((())) (*"))
    //" -  ((())  () () (*)0  2,1  0   1,2 1,2      3,1  1,2  0      1
    //"(())((())()()(*)(*()(())())())()()((()())((()))(*"))

    // "((())) () (()) (*() () ())**(()) () () ()() ((*()*)) ((*()*)"
    //   0       0      0   0
    // (*) ** ((*()*)


    // "(*(()))((())())*(**(()))((*)()(()))*(())()(())(()"
    //  (*(())) ((()) ())*(**(())) ((*)()(()))*(()) () (()) (()
    //  0        3,2


}