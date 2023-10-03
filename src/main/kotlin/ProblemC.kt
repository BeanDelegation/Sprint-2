class ProblemC {

    fun main() {
        readInt()

        val result = mutableListOf<Pair<Int, Int>>()
        val inputList = readListInt().sorted()

        for (i in inputList.indices step 2) {
            if (i + 1 < inputList.size) {
                val pair = Pair(inputList[i], inputList[i + 1])
                result.add(pair)
            }
        }

        var totalDifference = 0

        for ((first, second) in result) {
            val difference = second - first
            totalDifference += difference
        }

        println("$totalDifference")
    }
}