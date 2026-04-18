class Solution {
    fun firstUniqChar(s: String): Int {
        var charMap= mutableMapOf<Char,Int>()
        for(ch in s){
            charMap[ch]=charMap.getOrDefault(ch,0)+1
        }

        for(i in s.indices){
            if(charMap[s[i]]==1){
                return i
            }
        }
        return -1
    }
}
