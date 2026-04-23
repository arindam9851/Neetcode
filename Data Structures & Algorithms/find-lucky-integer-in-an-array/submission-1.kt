class Solution {
    fun findLucky(arr: IntArray): Int {
        val map = mutableMapOf<Int,Int>()
        var luckyNumber = -1
        for(value in arr){
            map[value]=map.getOrDefault(value,0)+1
        }

        for ((key,value) in map){
            if(key==value){
                luckyNumber = maxOf(luckyNumber,key)
                
            }
        }
        
         return luckyNumber
    }
}
