###  Alphabetically Smallest String Builder

Given a list of strings, concatenate
those strings into the alphabetically
smallest string possible.


Example
substrings = `['a','bd','ac','cd']`
Return `aacbdcd`.

Example
substrings = `['c', 'cc', 'cca', 'cccb']`
Return `ccacccbccc`.

Example
substrings = `['d','da','db','dc', 'dd','de']`
Return `dadbdcdddde`.

**Function Description**

Complete the function
smallestString in the editor below.
smallestString has the following
parameter(s):
    string substrings[n]:  an array of
strings
Returns:
    string: the alphabetically smallest
string formed by the concatenation
of all elements of substrings

_Constraints_
```
1 ≤ n ≤ 3500
1 ≤ length of substrings[i] ≤ 1000
Each substrings[i] is composed of
lowercase letters only, ascii[a-z].
```