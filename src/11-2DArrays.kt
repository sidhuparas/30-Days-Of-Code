import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    var maxSum = -64
    var hourSum = 0

    for (i in 0 until 4) {
        for (j in 0 until 4) {
            hourSum = arr[i+1][j+1]

            for (k in 0 until 3) {
                hourSum += arr[i][j + k] + arr[i + 2][j + k]
            }
            if (hourSum>maxSum)
                maxSum = hourSum
        }
    }
    println(maxSum)
}
