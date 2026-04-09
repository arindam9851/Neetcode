class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        var stack= ArrayDeque<Int>()
        var map = mutableMapOf<Int,Int>()
        var result = mutableListOf<Int>()
        for(num in nums2){
            while (stack.isNotEmpty() && num > stack.last()) {
            val top = stack.removeLast()
            map[top] = num
        }
        stack.addLast(num)
        }
        for(num in nums1){
            if(map.containsKey(num)){
                result.add(map[num]!!)
            }
            else{
                result.add(-1)
            }
        }
        return result.toIntArray()
        
    }
}
