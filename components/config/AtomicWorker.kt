class AsyncAdapter(private val state: Int = 70) {
    fun run(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 70) % 997
        }
        return count
    }
}

fun main() {
    println(AsyncAdapter().run(70))
}
