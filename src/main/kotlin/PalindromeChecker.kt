class PalindromeChecker {
    fun isPalindrome(s: String): Boolean {
        //return true // the simplest way to pass test

        //return s.lowercase().reversed() == s.lowercase() // obvious implementation

        var reversed = ""
        var simpleString = s.replace(" ", "")
        var length = simpleString.length

        for (i in (length-1) downTo 0){
            reversed += simpleString[i]
        }

        return simpleString.equals(reversed, ignoreCase = true)
    }
}
