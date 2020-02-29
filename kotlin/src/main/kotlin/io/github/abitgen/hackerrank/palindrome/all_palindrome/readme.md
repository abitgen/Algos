#Find count of all Palindrome in string

A palindrome is a string that reads the same from the left and from the right.  For example, mom and
tacocat are palindromes, as are any single character strings.  Given a string, determine the number
of its substrings that are palindromes.  For example, the string is s = &#39;tacocat&#39;.  Palindromic

substrings are [&quot;t&quot;, &quot;a&quot;, &quot;c&quot;, &quot;o&quot;, &quot;c&quot;, &quot;a&quot;, &quot;t&quot;, &quot;coc&quot;, &quot;acoca&quot;, &quot;tacocat&quot;].  There are 10 palindromic
substrings.
 
Function Description
Complete the countPalindromes function in your editor. It should return an integer that represents
the number of palindromic substrings in the given string.
 
countPalindromes has the following parameter:
    s: the string to analyze
 
Constraints
 1 ≤ |s| ≤ 5 × 10 3
 each character of s, s[i] ∈ {&#39;a&#39;-&#39;z&#39;}.
 
Input Format For Custom Testing
The first line contains a string, s.
 
Sample Case 0
Sample Input For Custom Testing
 
aaa
 
Sample Output 0
6
 
Explanation 0
There are 6 possible substrings of s: {&quot;a&quot;, &quot;a&quot;, &quot;a&quot;, &quot;aa&quot;, &quot;aa&quot;, &quot;aaa&quot;}. All of them are palindromes, so
return 6.
 
Sample Case 1
Sample Input For Custom Testing
abccba
 
Sample Output 1
9

Explanation 1
There are 21 possible substrings of s, the following 9 of which are palindromes: {&quot;a&quot;, &quot;a&quot;, &quot;b&quot;, &quot;b&quot;, &quot;c&quot;,
&quot;c&quot;, &quot;cc&quot;, &quot;bccb&quot;, &quot;abccba&quot;}.
 
Sample Case 2
Sample Input For Custom Testing
daata
 
Sample Output 2
7
 
Explanation 2
There are 15 possible substrings of s, the following 7 of which are palindromes: {&quot;a&quot;, &quot;a&quot;, &quot;a&quot;, &quot;aa&quot;,
&quot;ata&quot;, &quot;d&quot;, &quot;t&quot;}.