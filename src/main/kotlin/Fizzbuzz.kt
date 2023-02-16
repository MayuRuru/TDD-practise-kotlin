class Fizzbuzz {
    fun exec(number: Int): String {
        if (isMultipleOfThreeAndFive(number)) return "Fizzbuzz"
        if (isMultipleOfThree(number)) return "Fizz"
        if (isMultipleOfFIve(number)) return "Buzz"
        return number.toString()
    }
    private fun isMultipleOfThreeAndFive(number: Int) = number % 15 == 0
    private fun isMultipleOfThree(number: Int) = number % 3 == 0
    private fun isMultipleOfFIve(number: Int) = number % 5 == 0
}