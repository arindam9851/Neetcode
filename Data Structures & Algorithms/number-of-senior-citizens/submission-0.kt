class Solution {
    fun countSeniors(details: Array<String>): Int {
        val result = details.map{
            it.takeLast(4)
            .take(2)
            .toInt()
        }
        var count:Int=0
        for(age in result){
            if(age>60){
                count +=1
            }
        }
        return count
    }
}
