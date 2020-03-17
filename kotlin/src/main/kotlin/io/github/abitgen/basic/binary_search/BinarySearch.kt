package io.github.abitgen.basic.binary_search

class BinarySearch {
}

fun main(){
    val list = listOf<String>("A","C","X","Z","B","Y","N").sorted()
    println("Sorted List is : $list")
    val searchFor = "Z"
    val valueIndex = binarySearch(0, list.size-1, list, searchFor)
    if(valueIndex == -1)
        println("Element not found")
    else
        println("Element found at index $valueIndex")
}

fun binarySearch(
    first: Int,
    last: Int,
    list: List<String>,
    searchFor: String
) :Int{
    val mid = (first+last)/2
    if(searchFor == list[mid]){
        return mid
    }
    if(searchFor < list[mid]){
        return binarySearch(0, mid, list, searchFor)
    }
    // mid+1 is required here, otherwise last item cannot be searched.
    if(searchFor > list[mid]){
        return binarySearch(mid+1, last, list, searchFor)
    }

    return -1;
}