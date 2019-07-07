import java.util.*
import kotlin.collections.HashMap

fun main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().trim().toInt()

    val map: HashMap<String, String> = HashMap()

    for (i in 1..n){
        val full = scanner.nextLine()
        val name = full.split(" ")[0]
        val num = full.split(" ")[1]
        map[name] = num
    }

    val list: MutableList<String> = mutableListOf()

    while (scanner.hasNext()){
        list.add(scanner.next())
    }

    for (item in list){
        if (map.contains(item))
            println("$item=${map[item]}")
        else
            println("Not found")
    }
    scanner.close()
}