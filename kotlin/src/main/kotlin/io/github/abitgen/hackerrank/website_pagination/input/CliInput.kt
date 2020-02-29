package io.github.abitgen.hackerrank.website_pagination.input

import io.github.abitgen.hackerrank.website_pagination.InputContract

class CliInput : InputContract{

    override fun pageNumberCount():Int? {
        print("Enter Page Number Count : ")
        return readLine()?.toIntOrNull()
    }

    override fun perPageCount():Int? {
        print("Enter PerPage Count : ")
        return readLine()?.toIntOrNull()
    }

    override fun getSortOrder():Int? {
        print("Enter Sort Order : ")
        return readLine()?.toIntOrNull()
    }

    override fun getSortParameter():Int? {
        print("Enter Sort Parameter : ")
        return readLine()?.toIntOrNull()
    }

    override fun getItemList(totalItems: Int?, totalAttributesPerItem: Int?):List<List<String>> {
        val itemList = mutableListOf<List<String>>()
        var eachItem = 0

        while (eachItem < totalItems ?: 0) {
            print("Enter Item ${eachItem + 1} : ")
            val attributes = readLine()?.split(" ")
            if (attributes?.count() == totalAttributesPerItem) {
                itemList.add(attributes?.toList() ?: listOf())
                eachItem++
            }
        }
        return itemList
    }

    override fun getTotalAttributesPerItem(): Int? {
        print("Enter Total Item Attributes : ")
        return readLine()?.toIntOrNull()
    }

    override fun getTotalItems(): Int? {
        print("Enter Total Items : ")
        return readLine()?.toIntOrNull()
    }
}
