import java.util.*

private val scanner = Scanner(System.`in`)

    // Complete the solve function below.
    fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {
        val total_tip = meal_cost * tip_percent / 100
        val total_tax = meal_cost * tax_percent / 100
        println(Math.round(meal_cost + total_tip + total_tax))

    }

    fun main() {
        val meal_cost = scanner.nextDouble()
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")

        val tip_percent = scanner.nextInt()
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")

        val tax_percent = scanner.nextInt()
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")

        solve(meal_cost, tip_percent, tax_percent)
        scanner.close()
    }
