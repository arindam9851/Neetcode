class Solution {
    fun isValid(s: String): Boolean {
        
        val openMap = mutableMapOf(
            '(' to ')',
            '{' to '}',
            '[' to ']'
        )
            
        val stack = ArrayDeque<Char>()

        for(ch in s){
            when (ch){
                '(','{','[' -> {
                    stack.addLast(openMap[ch])
                }
                ')','}',']' ->{
                    if(stack.isEmpty() || stack.last!=ch){
                        return false
                    }
                    stack.removeLast()
                }

            } 
            
        }
       return stack.isEmpty() 
        
    }
}
