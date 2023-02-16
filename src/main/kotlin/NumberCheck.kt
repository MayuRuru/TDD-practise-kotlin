
class NumberCheck {
    fun exec(number: Int) {
        val numberToString = number.toString()

        println(
            if (isPrime(number)) {
                "$numberToString is prime,"
            } else {
                "$numberToString is not prime,"
            }
                    +
                    if (isFibonacci(number)) {
                        " is Fibonnacci "
                    } else {
                        " is not Fibonacci "
                    }
                    +
                    if (isPair(number)) {
                        "and is pair"
                    } else {
                        "and is odd"
                    }
        )
    }

        fun isPrime(number: Int): Boolean {
            if (number <= 1) return false
            for (i in 2..(Math.sqrt(number.toDouble()).toInt())) {
                if (number % i == 0) return false
            }
            return true
        }

        fun isPair(number: Int): Boolean {
                number % 2 == 0;
            return true
            }

        fun isFibonacci(number: Int): Boolean {
            val phi = (1 + Math.sqrt(5.0)) / 2
            val psi = (1 - Math.sqrt(5.0)) / 2
            return ((Math.pow(phi, number.toDouble()) - Math.pow(
                psi,
                number.toDouble()
            )) / Math.sqrt(5.0)).toInt() == number
        }

}

