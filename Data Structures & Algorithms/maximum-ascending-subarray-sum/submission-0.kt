class Solution {
    fun maxAscendingSum(nums: IntArray): Int {

        var right = 1
        var current = nums[0]
        var max =nums[0]

        while(right < nums.size){
            if( nums[right]>nums[right-1]){
                current += nums[right]
            }
            else{
                max = maxOf(current,max)
                current= nums[right]
            }

            right++
        }

        return maxOf(max,current)


    }
}
