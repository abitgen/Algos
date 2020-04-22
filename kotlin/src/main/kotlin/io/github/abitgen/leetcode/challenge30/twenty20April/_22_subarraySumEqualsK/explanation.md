 #### Solution explanation

Input : arr=[1,5,3,3,6]  k=6

Output : 3

Initialized count, sum to 0
Initialied a hashmap with one item (0 to 1)

Loop iteration steps

  [0]  1 -> 
  
        sum => 1
        map.containsKey(1 - 6) = false
        map[1] => 1

  [1]  5 ->
  
        sum => 6
        map.containsKey(6 - 6) = true
        count => map[6 - 6] => 1
        map[6] => map[6] + 1 => 1

  [2]  3 ->
  
        sum => 9
        map.containsKey(9 - 6) = false
        map[9] => map[9] + 1 => 1

  [3]  3 ->
  
        sum => 12
        map.containsKey(12 - 6) = true
        count => count + map[6] => 1 + 1 => 2
        map[12] => map[12] + 1  => 1

  [4] 6 ->
  
        sum => 18
        map.containsKey(18 - 6) = true
        count => count + map[12] => 2 + 1 => 3
        map[18] => map[18] + 1  => 1

return count  3