package challenges

import java.io.File

fun main() {
    val ipToCount = mutableMapOf<String, Int>()
    File("src/60.ips.txt").forEachLine {
//        if(ipToCount.containsKey(it)) {
//            val previous = ipToCount.get(it)!!
//            ipToCount.put(it, previous + 1)
//        } else {
//            ipToCount.put(it, 1)
//        }
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
    }

//    var maxIp = ipToCount.keys.first()
//    var maxCount = 0
//    for ((ip, count) in ipToCount.entries) {
//        if(count > maxCount) {
//            maxCount = count
//            maxIp = ip
//        }
//    }

    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }!!

    println("Most frequently used IP address is $maxIp, which occurred $maxCount times.")
}