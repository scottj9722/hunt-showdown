class AsyncEngine(private val state: Int = 67) {
    fun decode(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 67) % 997
        }
        return count
    }
}

fun main() {
    println(AsyncEngine().decode(67))
}
