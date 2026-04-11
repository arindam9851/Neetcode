class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var count = 0

        for (word in words) {
            var char = chars
            var valid = true

            for (i in word.indices) {
                if (char.contains(word[i])) {
                    char = char.replaceFirst(word[i].toString(), "")
                } else {
                    valid = false
                    break
                }
            }

            if (valid) {
                count += word.length
            }
        }

        return count
    }
}