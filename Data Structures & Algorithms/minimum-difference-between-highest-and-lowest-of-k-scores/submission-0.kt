class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        nums.sort()
        var minDiff = Int.MAX_VALUE
        val n= nums.size - k
        for(i in 0..n){
            var diff = nums[i+k-1]-nums[i]
            minDiff= minOf(minDiff,diff)
        }
        return minDiff
    }
}
