import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/*
 * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */

class NumberCheckTest {
/*    @Test
    fun `should receive number and return a string`(){
        val numbercheck = NumberCheck()
        val result = numbercheck.exec(2)
        assertThat(result).
    }*/

/*
    @Test
    fun `should receive number and return whether it is prime or not`(){
        val numbercheck = NumberCheck()
        val result = numbercheck.exec(2)
        assertThat(result).isEqualTo("2 is prime")
    }
*/

    @Test
    fun `should receive number and return a string checking three conditions`(){
        val numbercheck = NumberCheck()
        val result = numbercheck.exec(2)
        assertThat(result).isEqualTo("2 is prime, is Fibonacci and is pair")
    }



}