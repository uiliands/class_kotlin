package `20`.exemplos

fun main() {
    val (v1, v2, v3, v4) = listOf(2, 3, 5, 8)
    val (v5, v6, v7, v8, v9) = listOf(10, 20, 25, 30, 50)

    val s1 = (v1 * v4 + v6  - v1) - ((v8 - v7)+v6)
    val s2 =     (v2 * (v2 * v2 * v2)) / (v9-(v5/v1*8))
    val s3 = (((v1*v4)/v2) + (v2*v4)/v3%v2)

    println("Resultado: " + s1)
    println("Resultado: " + s2)
    println("Resultado: " + s3)
}