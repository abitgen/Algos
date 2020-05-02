package io.github.abitgen.leetcode.challenge30.twenty20May._1_firstBadVersion

import kotlin.random.Random

class FirstBadVersion : VersionControl(){
    override fun firstBadVersion(n: Int) : Int {
        println(">>>> {Given} Total Versions $n")
        return binarySearch2(1, n)
    }

    /**
     * Recursive Solution results in StackOverflowError
     * for input version 2126753390
     */
    private fun binarySearch(startVersion:Int, endVersion:Int): Int {
        val mid = (startVersion+endVersion)/2
        val isBadVersion = isBadVersion(mid)
        val previousBadVersion = isBadVersion(mid-1)
        if(!previousBadVersion && isBadVersion) return mid
        return if(isBadVersion)
            binarySearch(startVersion, mid-1)
        else
            binarySearch(mid+1, endVersion)
    }

    /**
     * This Solution results in Time Limit exceeded in leetcode for input size 2126753390
     * But the java program approach runs just fine.
     */
    private fun binarySearch2(startVersion:Int, endVersion:Int): Int {

        var start = startVersion
        var mid = 1
        var end = endVersion

        while(start < end){
            mid = (start+end)/2
            if(isBadVersion(mid))
                end = mid
            else
                start = mid+1
        }
        return mid
    }
}

abstract class VersionControl : CheckVersion{

    private var badVersionStatusMap:HashMap<Int,Boolean> = hashMapOf()
    /**
     * Emulating isBadVersion
     */
    override fun isBadVersion(version: Int) :Boolean{
        if(badVersionStatusMap.isEmpty()){
            getBadVersion(version)
        }
        return badVersionStatusMap[version] ?: false
    }

    private fun getBadVersion(version: Int){
        val randomBadVersionStart = Random.nextInt(1, version)
        println(">>>> {Given} Setting bad Version to :$randomBadVersionStart")
        (1..version).forEach {
            badVersionStatusMap[it] = it >= randomBadVersionStart
        }

    }
}

interface CheckVersion {
    fun isBadVersion(version:Int) :Boolean
    fun firstBadVersion(n: Int): Int
}

fun main(){
    println("First Bad version found at ${FirstBadVersion().firstBadVersion(200)}")
}