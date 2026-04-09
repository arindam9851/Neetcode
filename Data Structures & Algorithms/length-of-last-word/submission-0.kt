class Solution {
    fun lengthOfLastWord(s: String): Int {
        val trim=s.trim()
        val parts= trim.split(" ")
        return parts.last().length
    }
}
