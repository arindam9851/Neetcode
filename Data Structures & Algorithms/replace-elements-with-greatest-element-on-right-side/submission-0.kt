//current solution is O(n²)
class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val result = IntArray(arr.size)
        for(i in arr.indices){
            var max = -1
            for(j in i+1 until arr.size){
                if(arr[j]>max){
                    max = arr[j]
                }
            }
            result[i]=max
        }

    return result
    }
    
}
