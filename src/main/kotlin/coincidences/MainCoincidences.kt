package coincidences

fun main() {
    val str1 = readLine()!!.split(" ")
    val str2 = readLine()!!.split(" ")

    println(coincidences(str1, str2))
}

fun coincidences(str1: List<String>, str2: List<String>): Int {
    var count = 0
    val set1: HashSet<String> = hashSetOf()
    val set2: HashSet<String> = hashSetOf()

    for (str in str1) set1.add(str)
    for (str in str2) set2.add(str)

    if (str1.size > str2.size) { // Идём по меньшему списку
        for (set in set2) {
            if (set1.contains(set)) {
                count ++
            }
        }
    } else {
        for (set in set1) {
            if (set2.contains(set)) {
                count ++
            }
        }
    }

    return count
}