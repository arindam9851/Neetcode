class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var i=0
        var j=0
    
        var finalString = StringBuilder()
        while(i<word1.length && j<word2.length){
            finalString.append(word1[i])
            finalString.append(word2[j])
            i++
            j++
        }
        if(j<word2.length){
            finalString.append(word2.substring(j,word2.length))
        }
        if(i<word1.length){
            finalString.append(word1.substring(i,word1.length))
        }

        return finalString.toString()
    }
}
