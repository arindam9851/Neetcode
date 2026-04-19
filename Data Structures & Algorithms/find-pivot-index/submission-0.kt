class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val n = nums.size
        val prefixArray= IntArray(n)
        prefixArray[0]=nums[0]
        for(i in 1 until n){
            prefixArray[i]= prefixArray[i-1]+nums[i]
        }

        for(i in 0 until n){
            var leftSum = if(i==0) 0 else prefixArray[i-1]
            var rightSum = prefixArray[n-1]- prefixArray[i]

            if(leftSum==rightSum)
            {
                return i
            }
        }
        return -1
    }
}
