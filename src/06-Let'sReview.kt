import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().trim().toInt()
    val list: ArrayList<String> = ArrayList(n)

    for (i in 1..n) {
        list.add(scanner.nextLine().trim())
    }

    for (item in list) {
        var arr = item.toCharArray()
        var even=""
        var odd=""
        for (a in 0 until arr.size){
            if (a%2==0)
                even = even.plus(arr[a])
            else
                odd = odd.plus(arr[a])
        }
        println("$even $odd")
    }
}