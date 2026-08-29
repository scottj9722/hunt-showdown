class AtomicScheduler(private val state: Int = 87) {
    fun collect(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 87) % 997
        }
        return result
    }
}

fun main() {
    println(AtomicScheduler().collect(87))
}
