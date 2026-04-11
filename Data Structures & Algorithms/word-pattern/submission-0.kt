class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val splitS= s.split(" ")
        if(pattern.length!=splitS.size){
            return false
        }
        val charMap = mutableMapOf<Char,String>()
        val wordMap = mutableMapOf<String,Char>()
        for(i in pattern.indices){
            var char= pattern[i]
            var word = splitS[i]
            if(charMap.containsKey(char)){
                if(charMap[char]!= word)
                    return false
            }
            else{
                charMap[char]=word
            }

            if(wordMap.containsKey(word)){
                if(wordMap[word]!=char)
                    return false
            }
            else {
                wordMap[word]=char
            }
        }
        return true

    }
}