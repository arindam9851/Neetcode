class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val allowSet = allowed.toSet()
        var count =0

        for(word in words){
            var isValid=true
            for (ch in word){

                if(!allowSet.contains(ch)){
                    isValid = false
                    break
                }
            }
            if(isValid)
            count++

        }
        return count
    }
}