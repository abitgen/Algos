package io.github.abitgen.hackerrank.website_pagination

interface InputContract {
    fun pageNumberCount() : Int?
    fun perPageCount() : Int?
    fun getSortOrder() : Int?
    fun getSortParameter() : Int?
    fun getItemList(totalItems: Int?, totalAttributesPerItem: Int?) : List<List<String>>
    fun getTotalAttributesPerItem(): Int?
    fun getTotalItems(): Int?
}