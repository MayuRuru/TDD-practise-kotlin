import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

class HackerLanguageTest {
    @Test
    fun `should receive a string and return a string`(){
        val leettranslator = LeetTranslator()
        val translation = leettranslator.exec("A")
        assertThat(translation).isEqualTo("4")
    }

    @Test
    fun `should translate A to 4`(){
        val leettranslator = LeetTranslator()
        val translation = leettranslator.exec("A")
        assertThat(translation).isEqualTo("4")
    }

    @Test
    fun `should translate B to 13`(){
        val leettranslator = LeetTranslator()
        val translation = leettranslator.exec("B")
        assertThat(translation).isEqualTo("I3")
    }

    @Test
    fun `should translate c to 13`(){
        val leettranslator = LeetTranslator()
        val translation = leettranslator.exec("c")
        assertThat(translation).isEqualTo("[")
    }

    @Test
    fun `should translate leet to 1337`(){
        val leettranslator = LeetTranslator()
        val translation = leettranslator.exec("lEet")
        assertThat(translation).isEqualTo("1337")
    }

}