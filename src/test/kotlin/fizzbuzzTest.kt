import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

class FizzbuzzTest {
    @Test
    fun `should receive number and return number`() {
        val fizzbuzz = Fizzbuzz()
        val result = fizzbuzz.exec(1)
        assertThat(result).isEqualTo("1")
    }

    @Test
    fun `should return Fizz if number is multiple of three`() {
        val fizzbuzz = Fizzbuzz()
        val result = fizzbuzz.exec(3)
        assertThat(result).isEqualTo("Fizz")
    }

    @Test
    fun `should return Buzz if number is multiple of five`() {
        val fizzbuzz = Fizzbuzz()
        val result = fizzbuzz.exec(5)
        assertThat(result).isEqualTo("Buzz")
    }

    @ParameterizedTest
    @CsvSource(
        "15",
        "30"
    )
    fun `should return Fizzbuzz if number is multiple of three and five`(number: Int) {
        val fizzbuzz = Fizzbuzz()
        val result = fizzbuzz.exec(number)
        assertThat(result).isEqualTo("Fizzbuzz")
    }

}