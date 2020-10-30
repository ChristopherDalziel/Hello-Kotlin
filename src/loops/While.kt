package loops

fun main() {
    // For loops are much better for the following two cases, they're much more concise and less prone to errors as you do not need to set extra variables etc
    var x = 9
    // While x isn't equal to 0 count down
    while(x >= 0) {
        println(x)
        x--
    }

    var i = 0
    while(i <= 10) {
        println(i)
        i++
    }

    // While loops can be used on variables/objects like the following below - this is where they're most powerful
    // while(user.isOnline()) {}

    // while (input != "quit") {
    //    println("You typed $input")
    //}
}