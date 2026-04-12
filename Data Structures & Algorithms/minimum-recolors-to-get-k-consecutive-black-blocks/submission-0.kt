class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var left =0
        var right =k-1
        var result= 0
        var whiteCount =0

        for(i in left..right){
            if(blocks[i]=='W'){
                whiteCount++
            }
        }
        result=whiteCount

        while(right+1 < blocks.length){
            if(blocks[left]=='W')
            whiteCount --

            left++
            right++

            if(blocks[right]=='W')
            whiteCount ++

            result = minOf(result,whiteCount)
        }
        return result

    }
}
