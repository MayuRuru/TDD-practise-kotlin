import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/*
    Create a palindrome checker
    It should be able to detect that a string is a palindrome: that is, it is the same word or phrase in reverse.
    Words like "mom" are palindromes
    Words like "bill" aren't palindromes
    It should still know that something is a palindrome, even if the casing is off. So that means that "Mom" is still a palindrome.
    It should also be able to detect palindromes in phrases like "Was It A Rat I Saw" and "Never Odd or Even" too.
* */


class palindromeTest {

    private val palindromeChecker: PalindromeChecker = PalindromeChecker()

    @Test
    fun `should tell that "mom" is a palindrome`(){
        //val palindromeChecker = PalindromeChecker()
        val result = palindromeChecker.isPalindrome("mom")
        assertTrue(result)
    }

    @Test
    fun `should tell that "bill" is not a palindrome`(){
        //val palindromeChecker = PalindromeChecker()
        val result = palindromeChecker.isPalindrome("bill")
        assertFalse(result)
    }

    @Test
    fun `should still detect a palindrome even if the casing is off`(){
        //val palindromeChecker = PalindromeChecker()
        //val result = palindromeChecker.isPalindrome("Mom")
        assertTrue(palindromeChecker.isPalindrome("Mom"))
    }

    @Test
    fun `should be able to tell that "Was It A Rat I Saw" is a palindrome`(){
        assertTrue(palindromeChecker.isPalindrome("Was It A Rat I Saw"))
    }

    @Test
    fun `should be able to tell that "Never Odd or Even" is palindrome`(){
        assertTrue(palindromeChecker.isPalindrome("Never Odd or Even"))
    }

}