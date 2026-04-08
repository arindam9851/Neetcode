class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result=StringBuilder()
        strs.sort()
        var first = strs[0]
        var last = strs[strs.size-1]

        for(i in first.indices){
            if(first[i]!=last[i]){
                break
            }
            else{
                result.append(first[i])
            }
        }
        return result.toString()

    }
}
