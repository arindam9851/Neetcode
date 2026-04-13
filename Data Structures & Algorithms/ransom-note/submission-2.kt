class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineMap = mutableMapOf<Char,Int>()
        val ransomMap = mutableMapOf<Char,Int>()

        for(ch in magazine){
            magazineMap[ch]= magazineMap.getOrDefault(ch,0)+1
        }
        for(ch in ransomNote){
            ransomMap[ch]= ransomMap.getOrDefault(ch,0)+1
        }

        for(key in ransomMap.keys){
            if (!magazineMap.containsKey(key) || ransomMap[key]!! > magazineMap[key]!!) {
            return false
    }
        }
        return true
    }
}
