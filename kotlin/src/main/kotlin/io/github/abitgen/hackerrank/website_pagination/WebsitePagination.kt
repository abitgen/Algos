package io.github.abitgen.hackerrank.website_pagination

import io.github.abitgen.hackerrank.website_pagination.input.CliInput
import io.github.abitgen.hackerrank.website_pagination.input.MockInput

fun main() {

    val enableReal = false
    val input = if(enableReal) CliInput() else MockInput()
    input.apply {
        val totalItems = getTotalItems()
        val totalAttributesPerItem = getTotalAttributesPerItem()!!
        val sortParameter = getSortParameter()!!
        val sortOrder = getSortOrder()!!
        val perPage = perPageCount()!!
        val pageNum = pageNumberCount()!!
        getItemList(totalItems, totalAttributesPerItem).toTypedArray()
        returnPages(getItemList(totalItems, totalAttributesPerItem), totalAttributesPerItem, sortParameter, sortOrder, perPage, pageNum)
    }
}


fun returnPages(items: List<List<String>>, totalAttributesPerItem: Int, sortParameter: Int, sortOrder: Int, itemsPerPage:Int, pageNum:Int) {

    val sortedList = if (sortOrder == 1) items.sortedByDescending { it[sortParameter] }
                     else if (sortOrder == 0) items.sortedBy { it[sortParameter] }
                     else listOf()

    val totalPages = sortedList.size / itemsPerPage
    var outputList = listOf<List<String>>()
    if(pageNum <= totalPages){
         outputList = sortedList.filterIndexed { index, list ->
            val availablePageNum = if (itemsPerPage * pageNum > sortedList.size) (pageNum - 1) else pageNum
            index in (availablePageNum * itemsPerPage until (availablePageNum+1) * itemsPerPage)
        }
    }else{
        println("PageNumber Exceeds available pages")
    }
    println("")
    println(">>>>> Sorted Items")
    println(sortedList.joinToString("\n"))

    println("")
    println(">>>>> Sorted Items at PageNum $pageNum")
    println(outputList.joinToString("\n"))
}

fun returnPages(items: Array<Array<String>>, totalAttributesPerItem: Int, sortParameter: Int, sortOrder: Int, itemsPerPage:Int, pageNum:Int) {

    val sortedList = if (sortOrder == 1) items.sortedByDescending { it[sortParameter] }
    else if (sortOrder == 0) items.sortedBy { it[sortParameter] }
    else listOf()

    val totalPages = sortedList.size / itemsPerPage
    var outputList = listOf<Array<String>>()
    var finalProductList = arrayOf<String>()
    if(pageNum <= totalPages){
        outputList = sortedList.filterIndexed { index, list ->
            val availablePageNum = if (itemsPerPage * pageNum > sortedList.size) (pageNum - 1) else pageNum
            index in (availablePageNum * itemsPerPage until (availablePageNum+1) * itemsPerPage)
        }
        finalProductList = outputList.map { it[0] }.toTypedArray()
    }else{
        println("PageNumber Exceeds available pages")
    }
    println("")
    println(">>>>> Sorted Items")
    println(finalProductList.joinToString("\n"))

    println("")
    println(">>>>> Sorted Items at PageNum $pageNum")
    println(finalProductList.joinToString("\n"))
}