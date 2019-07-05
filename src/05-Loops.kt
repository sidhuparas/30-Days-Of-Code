import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    for (i in 1..10){
        println("$n x $i = ${n*i}")
    }
}
