package barGraph
// Подсчёт кол-во повторений символов в строке

fun main() {

    barGraph("!Hello World!")
}

fun barGraph(str: String) {
    val map = hashMapOf<Char, Int>()
    for (i in str) {
        map += if (map.containsKey(i)) {i to (map.getValue(i) + 1)} else {i to 1}
    }

    println(str)
    for (i in str) {
        print("${map.getValue(i)}")
    }

}