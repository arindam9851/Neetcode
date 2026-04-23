class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val list= mutableListOf<Int>()
        for(i in nums.indices){
            if(!nums.contains(i+1)){
                list.add(i+1)
            }
        }
        return list
    }
}
