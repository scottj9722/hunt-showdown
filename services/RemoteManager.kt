class CoreWorker(private val state: Int = 22) {
    fun flush(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 22) % 997
        }
        return value
    }
}

fun main() {
    println(CoreWorker().flush(22))
}
