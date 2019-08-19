import java.util.*

internal open class PersonNew(
        private val firstName: String,
        private var lastName: String,
        private var idNumber: Int
) {

    // Print person data
    fun printPerson() {
        println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber)
    }

}

internal class StudentNew(firstName: String,
                          lastName: String,
                          identification: Int,
                          private val testScores: IntArray)
    : PersonNew(firstName, lastName, identification) {

    fun calculate(): Char {
        var average = 0f
        for (num in testScores) {
            average += num.toFloat()
        }
        average /= testScores.size.toFloat()

        return when (average) {
            in 90.0..100.0 -> 'O'
            in 80.0..90.0 -> 'E'
            in 70.0..80.0 -> 'A'
            in 55.0..70.0 -> 'P'
            in 40.0..55.0 -> 'D'
            else -> 'T'
        }
    }
}

fun main() {
    val scan = Scanner(System.`in`)
    val firstName = scan.next()
    val lastName = scan.next()
    val id = scan.nextInt()
    val numScores = scan.nextInt()
    val testScores = IntArray(numScores)
    for (i in 0 until numScores) {
        testScores[i] = scan.nextInt()
    }
    scan.close()

    val s = StudentNew(firstName, lastName, id, testScores)
    s.printPerson()
    println("Grade: " + s.calculate())
}
