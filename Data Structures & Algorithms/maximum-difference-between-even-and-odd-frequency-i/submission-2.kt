class Solution {
    fun maxDifference(s: String): Int {
        var map = mutableMapOf<Char,Int>()
        for(ch in s){
            map[ch]=map.getOrDefault(ch,0)+1
        }
        var maxOdd = Int.MIN_VALUE
        var minEven = Int.MAX_VALUE
        for(value in map.values){
            if(value%2==0)
            {   
             minEven = minOf(minEven, value) 
            }
            else
            {
            maxOdd = maxOf(maxOdd,value)
            }
        }
        
        return maxOdd-minEven

    }
}
