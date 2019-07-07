import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val revArr = arr.reversedArray()
    for (i in 0 until revArr.size){
        print("${revArr[i]} ")
    }
}
