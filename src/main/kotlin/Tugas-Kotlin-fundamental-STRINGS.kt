fun main() {
    val text = "Kotlin is"
    val name = """
        $text Modern
        $text Concise
        $text Pragmatic
        $text Safe
    """.trimIndent()
    print("$name")
}