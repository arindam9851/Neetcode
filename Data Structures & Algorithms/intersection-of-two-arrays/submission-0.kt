class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val list = mutableSetOf<Int>()

        for(num in nums1){
            if(nums2.contains(num)){
                list.add(num)
            }
        }
        return list.toIntArray()
    }
}
