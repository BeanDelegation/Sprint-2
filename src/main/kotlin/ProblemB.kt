class ProblemB {

    fun main() {
        val alphabet = ('a'..'z').toList()

        repeat(readInt()) {
            val builder: StringBuilder = StringBuilder()
            val listInt = readListInt()
            var n = listInt[0]

            while (n > 0) {
                builder.append(alphabet[n % listInt.get(1)])
                n--
            }

            println(builder.toString())
        }
    }
}