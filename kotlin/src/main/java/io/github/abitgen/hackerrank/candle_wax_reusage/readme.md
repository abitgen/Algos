###  Candle Wax Re-usage Problem

Residue of Candle wax is reused to create new candles. 
Depends on residue number of burn out candles we can
convert wax into new candle.
N is total amount and C be the being the price of each
candle. For every R candle residue we can create one new
candle. You need to calculate how many candles can be
made out of candles purchased. So output will be
total_no_of_candles (Purchased+Created from residue).

>Input Format:

The first line contains the number of test cases T (<=1000).
Each of the next T lines contains three integers N, C and M

>Output Format:

Print the total number of Candles.

_Constraints:_
```

2 <= N <= 100000
1 <= C <= N
1 < R <= N
```

**Sample input**

```
2
10 2 5
6 2 2
```

Explanation for Sample Input:

```
First line value 2 denotes number of input lines

Second line denotes first input. 10 2 5 => 10 denotes the
total amount, 2 denotes price per candle, 5 denotes number
of candles residue will create a new candle.

Third line denotes 2nd input. 6 2 2 => 6 denotes the
total amount, 2 denotes price per candle, 2 denotes
number of candles residue will create a new candle.

```

Sample Output

```
6
5
```

Explanation of output

```
6 is derived as output for second line of input [10/2=5, 5/5=1, 5+1 => 6]

5 is derived as output for third line of input [6/2=3, 3/2=1, 2+1=3, 3/2=1, 3+1+1 => 5]
```