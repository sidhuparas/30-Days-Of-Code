import java.util.*

class Person(initialAge: Int) {
    var age: Int = 0

    init {
        // Add some more code to run some checks on initialAge
        if (initialAge >= 0) {
            age = initialAge
        } else {
            age = 0
            println("Age is not valid, setting age to 0.")
        }
    }

    fun amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        when {
            age < 13 -> println("You are young.")
            age in 13..17 -> println("You are a teenager.")
            else -> println("You are old.")
        }
    }

    fun yearPasses() {
        // Increment this person's age.
        age++
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val T = sc.nextInt()
    for (i in 0 until T) {
        val age = sc.nextInt()
        val p = Person(age)
        p.amIOld()
        for (j in 0..2) {
            p.yearPasses()
        }
        p.amIOld()
        println()
    }
    sc.close()
}