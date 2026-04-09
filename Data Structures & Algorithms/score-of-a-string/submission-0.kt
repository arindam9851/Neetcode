class Solution {
    fun scoreOfString(s: String): Int {
        var size = s.length-1
        var i=0
        var diff=0
        while(i<=size && i+1<=size){
            diff+= abs(s[i].code - s[i+1].code)
            i++
        }
        return diff
    }
}
