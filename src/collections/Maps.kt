package collections

fun main() {
    // Creating our map variables, these have the same result - the second is slightly more readable.
    val namesToAges = mapOf(Pair("Peter", 24), Pair("Fred", 66))
    val namesToAges2 = mapOf("Peter" to 24, "Fred" to 66)

    println(namesToAges == namesToAges2)

    // Access basic data in a Map
    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    // Create a mutable map
    val countryToInhabitants = mutableMapOf(
            "Germany" to 80_000_000,
            "USA" to 300_000_000
    )

    // Add values to a mutable map
    countryToInhabitants.put("Australia", 23_000_000)
    countryToInhabitants.putIfAbsent("USA", 320_000_000)

    // Print the object
    println(countryToInhabitants)

    // Check keys or values inside of a map
    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.containsKey("Australia"))
    println(countryToInhabitants.containsValue(50))

    // How to get a value of an existing key or add a default value if the key doesn't exist
    println(countryToInhabitants.get("USA"))
    println(countryToInhabitants.getOrDefault("France", 0))

    // Loop through and print out each entry in a useful / readable way
    namesToAges.entries.forEach {
        // Once again the it refers to the entry that is currently been looked at
        println("${it.key} is ${it.value} years old.")
    }
}