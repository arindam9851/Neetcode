class Solution {
    fun minOperations(s: String): Int {
        if(s.length==1) return 0
        var count1 =0
        var count2=0
        for( i in s.indices){
            var expected1 = i%2 // for 0101 pattern
            var expected2= (i+1)%2 // for 1010 pattern
            if(expected1!=s[i].digitToInt())
            {
                count1++
            }
            if(expected2!=s[i].digitToInt())
            {
                count2++
            }
        }
        return minOf(count1,count2)
        
    }
}