class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val setNums = mutableSetOf<Int>()
        var left =0

        for(right in nums.indices){
            //Step 1
            if(setNums.contains(nums[right])){
                return true
            }
            //Step 2
            setNums.add(nums[right])

            //Step 3 window size check
            if(right-left>=k){
                setNums.remove(nums[left])
                left++
            }
        }
        return false
    }
}
