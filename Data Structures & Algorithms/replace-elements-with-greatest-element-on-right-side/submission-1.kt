//current solution is O(n)
class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var maxRight =-1

        for(i in arr.lastIndex downTo 0){
            var current = arr[i]
            arr[i]=maxRight
            if(current>maxRight){
                maxRight=current
            }
           
        }
        return arr

    }
    
}
