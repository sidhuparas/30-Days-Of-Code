import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    var n = scan.nextLine().trim().toInt()

    var sum = 0
    var max = 0
    while (n > 0) {
        if (n % 2 == 1) {
            sum++
            if (sum > max) {
                max = sum
            }
        } else { sum = 0 }
        n /= 2
    }
    println(max)
}
