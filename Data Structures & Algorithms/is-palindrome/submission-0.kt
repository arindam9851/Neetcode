class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleaned = s.replace("[^A-Za-z0-9]".toRegex(), "")
        var left=0
        var right = cleaned.length-1
        while(left<=right){
            if(cleaned[left].lowercaseChar() == cleaned[right].lowercaseChar()){
                left++
                right--
            }
            else{
                return false
            }
        }
        return true
    }
}
