class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var sMap= mutableMapOf<Char,Int>()
        var tMap= mutableMapOf<Char,Int>()
        var result : Boolean =false
        for(ch in s){
            sMap[ch]=sMap.getOrDefault(ch,0)+1
        }
        for(ch in t){
            tMap[ch]=tMap.getOrDefault(ch,0)+1
        }
        if(sMap.size != tMap.size){
            return false
        }
        for(key in sMap.keys){
            if(tMap.containsKey(key)){
                if(sMap[key]==tMap[key]){
                    result = true
                }
                else{
                    result = false
                }
                
            }
            else{
                result = false
            }
        }
        return result
    }
}
