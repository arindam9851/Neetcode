class Solution {
    fun largestGoodInteger(num: String): String {
        var max =""
        val n= num.length - 3+1
        for ( i in 0 until n){
            if(num[i]==num[i+1] && num[i]== num[i+2]){
                var candidate = num.substring(i,i+3)
                if(candidate>max){
                    max = candidate
                }
            }
        }
        return max

    }
}
