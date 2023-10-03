class ProblemA {

    fun main() {
        repeat(readInt()) {
            val listInt = readListInt()
            var result = 0L

            for (i in IntRange(0, listInt[2] - 1)) {
                if (i % 2 == 0) {
                    result += listInt[0]
                } else {
                    result -= listInt[1]
                }
            }

            println(result)
        }
    }
}