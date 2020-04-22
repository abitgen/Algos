 #### Solution explanation

##### Example 1
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


~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~

##### Example 2

Input : arr=[1,3,3,3,2,1,0,-3,9]  k=9

   [0] 1   ->
   
        sum => 1
        map.containsKey(1 - 9) = false
        map[1] => map[1] + 1  => 1
 
   [1] 3   ->       
        
        sum => 4
        map.containsKey(4 - 9) = false
        map[4] => map[4] + 1  => 1     
        
   [2] 3   ->       
        
        sum => 7
        map.containsKey(7 - 9) = false
        map[7] => map[7] + 1  => 1     
        
   [3] 3   ->       
        
        sum => 10
        map.containsKey(10 - 9) = true
        count => count + map[1] => 0 + 1 => 1
        map[10] => map[10] + 1  => 1         
        
   [4] 2   ->       
        
        sum => 12
        map.containsKey(12 - 9) = false     
        map[12] => map[12] + 1  => 1     
        
   [5] 1   ->       
        
        sum => 13
        map.containsKey(13 - 9) = true     
        count => count + map[4] => 1 + 1 => 2
        map[13] => map[13] + 1  => 1             
        

   [6] 0   ->       
        
        sum => 13
        map.containsKey(13 - 9) = false    
        count => count + map[4] => 1 + 2 => 3 
        map[13] => map[13] + 1  => 2
   
        
   [7] -3   ->       
        
        sum => 10
        map.containsKey(10 - 9) = true     
        count => count + map[1] => 3 + 1 => 4         
        map[10] => map[10] + 1  => 2
        
   [8] 9   ->       
        
        sum => 19
        map.containsKey(19 - 9) = true    
        count => count + map[10] => 4 + 2 => 6 
        map[19] => map[19] + 1  => 1
        
return count  6                                               