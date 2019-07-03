import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()

    when {
        N%2 != 0 -> println("Weird")
        N%2 == 0 && ((N in 2..5) || N > 20) -> println("Not Weird")
        N%2 == 0 && (N>=6 || N<=20) -> println("Weird")
    }
}
