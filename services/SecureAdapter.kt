class RemoteCache(private val state: Int = 37) {
    fun render(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 37) % 997
        }
        return total
    }
}

fun main() {
    println(RemoteCache().render(37))
}
