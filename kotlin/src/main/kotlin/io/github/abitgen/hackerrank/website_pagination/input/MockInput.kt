package io.github.abitgen.hackerrank.website_pagination.input

import io.github.abitgen.hackerrank.website_pagination.InputContract

class MockInput : InputContract{

    override fun getSortOrder():Int? {
        val sortOrder = 1
        println("Enter Sort Order : $sortOrder")
        return sortOrder
    }

    override fun getSortParameter():Int? {
        val sortParameter = 1
        println("Enter Sort Parameter : $sortParameter")
        return sortParameter
    }

    override fun getItemList(totalItems: Int?, totalAttributesPerItem: Int?):List<List<String>> {
        val itemList = mutableListOf<List<String>>()
        var eachItem = 0
        val alphabet: List<Char> = ('a'..'z').toList()

        while (eachItem < totalItems ?: 0) {
            val attributes = listOf( List(5){alphabet.random()}.joinToString ( "" ), (1..9).random().toString(), ((1..9).random()*(4..6).random()).toString())
            println("Enter Item ${eachItem + 1} : ${attributes.joinToString (" " )}")
            if (attributes.count() == totalAttributesPerItem) {
                itemList.add(attributes)
                eachItem++
            }
        }
        return itemList
    }

    override fun getTotalAttributesPerItem(): Int? {
        val totalAttributesPerItem = 3
        println("Enter Total Item Attributes : $totalAttributesPerItem")
        return totalAttributesPerItem
    }

    override fun getTotalItems(): Int? {
        val totalItems = 20
        println("Enter Total Items : $totalItems")
        return totalItems
    }


    override fun pageNumberCount():Int? {
        val pageNum = 2
        println("Enter Page Number Count : $pageNum")
        return pageNum
    }

    override fun perPageCount():Int? {
        val perPage = 9
        println("Enter PerPage Count : $perPage")
        return perPage
    }
}
