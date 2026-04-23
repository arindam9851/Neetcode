class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val list = mutableSetOf<Int>()
        val set1 = nums1.toHashSet()
        for(num in nums2){
            if(set1.contains(num)){
                list.add(num)
            }
        }
        return list.toIntArray()
    }
}
