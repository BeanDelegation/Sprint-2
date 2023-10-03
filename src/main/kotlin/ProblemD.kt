class ProblemD {

    fun main() {

        repeat(readInt()) {
            readInt()
            val quantityCoins = readListLong().sortedDescending()
            var resultList = mutableListOf<Long>()

            for ((index, value) in quantityCoins.withIndex()) {
                resultList.add((index + 1) * value)
            }
            
            println(resultList.maxOf { it })
        }
    }

}