package countingSort

fun main() {
    val str= readLine()!!.split(" ")

    var max = str[0].toInt()
    var min = str[0].toInt()
    for (i in str) {
        if (i.toInt() > max) max = i.toInt()
        if (i.toInt() < min) min = i.toInt()
    }

    val array = IntArray(max + 1)

    for (i in str) {
        if (i != "") array[i.toInt()] ++
    }

    for (i in min..max) {
        if (array[i] > 0) {
            repeat(array[i]) {
                print("$i ")
            }
        }
    }

}

