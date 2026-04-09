class Solution {
    fun majorityElement(nums: IntArray): Int {
        var check = nums.size/2
        var map = mutableMapOf<Int,Int>()
        for(num in nums){
            map[num]=map.getOrDefault(num,0)+1

            if(map[num]!!>check){
                return num
            }
        }

        return -1
    }
}
