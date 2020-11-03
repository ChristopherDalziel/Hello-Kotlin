package loops

fun main() {

    // How we can give our loop a name

    // The @symbol creates the name for our loop and then the break is assigned to this outer loop within our if statement
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if(i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }

}