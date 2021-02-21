package `23`

fun main() {
    for (i in 0..100 step 2) {
        if (i in 96..100) {
            continue
        }
        println(i)
    }
    println("Saiu do loop")
//    var i = 0
//    while(i < 100) {
//        i = i+2
//        if (i == 96) {
//            i = i+4
//        }
//        println(i)
//    }
}