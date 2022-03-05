package guessNumber

fun main() {
    var str: String
    val n = readLine()!!.toInt()
    var mas: List<Int>
    var hidden = mutableSetOf<Int>()
    for(it in 1..n) {
        hidden.add(it)
    }
    while (true) {
        val input = readLine()!!.split(" ")
        if (input[0] == "HELP") break
        else {
            mas = input.map {it.toInt()}
        }

        str = readLine()!!

        if (str == "NO") {
            hidden.removeAll(mas.toSet()) // Удаляет из одного множества другое
        } else if (str == "YES") {
            hidden = hidden.intersect(mas.toSet()) as MutableSet<Int> // Пересечение двух множеств
        }
    }
    for (i in hidden) print("$i ")
}