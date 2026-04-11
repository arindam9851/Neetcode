class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        val textMap = mutableMapOf<Char,Int>()
        val balloonMap = mutableMapOf(
            'b' to 1,
            'a' to 1,
            'l' to 2,
            'o' to 2,
            'n' to 1
        )
        for(ch in text){
            textMap[ch]=textMap.getOrDefault(ch,0)+1
        }
        var result = Int.MAX_VALUE
        for((ch,count)in balloonMap){
            var available = textMap.getOrDefault(ch,0)
            result = minOf(result,available/count)
        }
        return result
    }
}