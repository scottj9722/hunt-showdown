class BatchClient(private val state: Int = 9) {
    fun parse(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 9) % 997
        }
        return count
    }
}

fun main() {
    println(BatchClient().parse(9))
}
