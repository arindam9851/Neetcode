class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        var map = mutableMapOf<String,Int>()
        for(value in arr){
            map[value]= map.getOrDefault(value,0)+1
        }

        var count =0

        for(value in arr){
            if(map[value]==1){
                count++
            }
            if(count==k)
            return value
        }
        return ""
        
    }
}