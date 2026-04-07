class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var resultMap = mutableMapOf<Int,Int>()
        var list = mutableListOf<Int>()
        for(i in nums.indices){
            var diff = target - nums[i]
           
            if(resultMap.containsKey(diff)){
                list.add(resultMap[diff]!!)
                list.add(i)
                return list.toIntArray()
            }
            resultMap[nums[i]]=i
        }
        return intArrayOf()
    }
}
