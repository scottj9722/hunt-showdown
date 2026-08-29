class AsyncRouter(private val state: Int = 25) {
    fun collect(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 25) % 997
        }
        return result
    }
}

fun main() {
    println(AsyncRouter().collect(25))
}
