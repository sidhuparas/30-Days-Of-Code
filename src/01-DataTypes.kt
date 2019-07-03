import java.util.*

fun main() {
    val i = 4
    val d = 4.0
    val s = "HackerRank "

    val scan = Scanner(System.`in`)

    /* Declare second integer, double, and String variables. */
    val num: Int
    val dob: Double
    val str: String
    /* Read and save an integer, double, and String to your variables.*/
    num = scan.nextInt()
    dob = scan.nextDouble()
    scan.nextLine()
    str = scan.nextLine()
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

    /* Print the sum of both integer variables on a new line. */
    println(i + num)
    /* Print the sum of the double variables on a new line. */
    println(d + dob)
    /* Concatenate and print the String variables on a new line;
        the 's' variable above should be printed first. */
    println(s + str)
    scan.close()
}