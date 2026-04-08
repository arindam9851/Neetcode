class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        var sortWords = words.sortedBy{it.length}
        var result = mutableSetOf<String>()
        for(i in sortWords.indices){
            for(j in i+1 until sortWords.size){
                if(sortWords[j].contains(sortWords[i])){
                    result.add(sortWords[i])
                }
            }
            
        }
        return result.toList()
    }
}
