class Solution {
    fun heightChecker(heights: IntArray): Int {
        val sortedArray = heights.sortedArray()
        var count =0

        for(i in heights.indices){
            if(heights[i]!=sortedArray[i]){
                count++
            }
        }
        return count
    }
}