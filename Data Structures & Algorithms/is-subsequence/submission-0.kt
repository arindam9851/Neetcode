class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var firstPointer =0
        var secondPointer =0
        var count =0

        while(firstPointer<=s.length-1 && secondPointer<=t.length-1){
            if(s[firstPointer]==t[secondPointer]){
                firstPointer++
                secondPointer++
                count++
            }
            else{
                secondPointer++
            }
        }
        return count==s.length
    }
}
