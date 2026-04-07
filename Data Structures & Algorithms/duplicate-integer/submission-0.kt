class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int,Int>()

        for(i in nums.indices){
            if(map.containsKey(nums[i])){
                return true
            }
            else{
                map[nums[i]]=1
            }
        }
        return false
    }
}
