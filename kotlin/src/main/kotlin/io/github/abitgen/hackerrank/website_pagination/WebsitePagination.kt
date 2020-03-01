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
        returnPages(getItemList(totalItems, totalAttributesPerItem), totalAttributesPerItem, sortParameter, sortOrder, perPage, pageNum)
    }
}


fun returnPages(itemList: List<List<String>>, totalAttributesPerItem: Int, sortParameter: Int, sortOrder: Int, perPage:Int, pageNum:Int) {

    val sortedList = if (sortOrder == 1) itemList.sortedByDescending { it[sortParameter] }
                     else if (sortOrder == 0) itemList.sortedBy { it[sortParameter] }
                     else listOf()

    val totalPages = sortedList.size / perPage
    var outputList = listOf<List<String>>()
    if(pageNum <= totalPages){
         outputList = sortedList.filterIndexed { index, list ->
            val availablePageNum = if (perPage * pageNum > sortedList.size) (pageNum - 1) else pageNum
            index in (availablePageNum * perPage until (availablePageNum+1) * perPage)
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