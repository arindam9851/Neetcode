class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {
        var localSet=mutableSetOf<String>()
        for(email in emails){
            var parts = email.split("@")
            var local = parts[0]
            var domain= parts[1]
            var removeDots= local.replace(".","")
            var subStringBefore= removeDots.substringBefore("+")
            localSet.add(subStringBefore+domain)
        }
        return localSet.size

    }
}
