Website Pagination 
 75 points
Filtering  Medium  Problem Solving  Sorting  Arrays  Algorithms 

Write the rudimentary business logic for an e-commerce website in order to perform some testing.
Your logic needs to mimic the logic of the website, only displaying the list of item names that will
display on a page of the actual website. The list of items will be provided in detail, where each item
detail is in the form of a string array: [name, relevance, price]. On the website, these items will be
listed in pages, each page displaying x items. All items are to be sorted either in ascending or
descending order, and the sort parameter can be any column of the item detail array, zero indexed.
 
Given the input as described, return an array having the names of all items that would be present on
a specified page, zero based numbering, in the order they should display.
 
For example, there are n = 3 items, items = [[item1, 10, 15], [item2, 3, 4], [item3, 17, 8]]. Also,
sortParameter = 1, sortOrder = 0. Indexing starts at zero, so we sort on items[][sortParameter] =
items[][1] = relevance in ascending order. If sortOrder = 1, that means sort descending. Finally, we
have x = 2 items per page, and we&#39;re looking for the item names on page number y = 1. If we sort
the items array on column 1, it becomes [[item2, 3, 4], [item1, 10, 15], [item3, 17, 8]]. Since there are
2 items on each page, the only item on page 1 is item3. The others are on page 0.
 
Function Description
Complete the function fetchItemsToDisplay in the editor below. The function must return an array of
names on the requested page in the order they are to be displayed.
 
fetchItemsToDisplay has the following parameter(s):
    items[items[0],...items[n-1]]:  a 2D array of arrays of strings in the form [name, relevance, price].
    sortParameter: an integer, the column of the items to sort on
    sortOrder: an integer, 0 = ascending and 1 = descending
    x: an integer, the number of items per page
    y: an integer, the page number to list
 
Constraints
 1 ≤ n &lt; 10 5
 0 ≤ relevance, price &lt; 10 8
 1 ≤ x &lt; 20
 0 ≤ y &lt; 10
 
Input Format For Custom Testing

The first line contains an integer, n​​​​, denoting the size of the array items.
The next line contains an integer, 3, denoting the attribute count of each item.
Each line i of the n subsequent lines (where 0 ≤ i &lt; n) contains three space-separated strings
representing items[i] in the form [name, relevance, price].
The next line contains an integer, sortParameter, denoting the column in items to sort on.
The next line contains an integer, sortOrder, 0 = ascending, 1 = descending.
The next line contains an integer, x, denoting the number of items displayed in a page.
The next line contains an integer, y, denoting the page to list items from.
Sample Case 0
Sample Input 0
2
3
p1 1 2
p2 2 1
0
0
1
0
Sample Output 0
p1
Explanation 0
The items are sorted by name, items column 0, in ascending order → [p1, p2]. Each page contains 1
item, so page 0 contains only the first item in the sorted list, p1.