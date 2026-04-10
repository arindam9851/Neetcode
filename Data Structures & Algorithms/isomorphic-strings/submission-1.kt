class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if(s.length!=t.length)
        return false
        var result = StringBuilder()
        val mapS= mutableMapOf<Char,Char>()
        val mapT= mutableMapOf<Char,Char>()
        for(i in s.indices){
            val c1 = s[i]
            val c2 = t[i]

            if(mapS.containsKey(c1)&& mapS[c1]!=c2){
                return false
            }
            if(mapT.containsKey(c2) && mapT[c2]!=c1){
                return false
            }
            mapS[c1]=c2
            mapT[c2]=c1
        }
        return true
        
    }
}
