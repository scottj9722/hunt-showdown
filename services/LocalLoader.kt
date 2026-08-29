class SmartCache(private val state: Int = 56) {
    fun sync(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 56) % 997
        }
        return count
    }
}

fun main() {
    println(SmartCache().sync(56))
}
