package unique

import kotlin.math.abs

fun main() {
    val str= readLine()!!.split(" ")

    var max = str[0].toInt()
    var min = str[0].toInt()
    for (i in str) {
        if (i != "" && i.toInt() > max) max = i.toInt()
        if (i != "" && i.toInt() < min) min = i.toInt()
    }

    println(unique(str, max, min))
}

fun unique(str: List<String>, max: Int, min: Int): StringBuffer {
    val string = StringBuffer()
    val array = IntArray(max + 1)
    val negArray = IntArray(abs(min) + 1)

    for (i in str) {
        if (i != "" && i.toInt() >= 0) array[i.toInt()] ++
        if (i != "" && i.toInt() < 0) negArray[abs(i.toInt())] ++
    }

    for (i in str) {
        if (i != "" && i.toInt() >= 0) {
            if (array[i.toInt()] == 1) {
                print("$i ")
            }
        }
        if (i != "" && i.toInt() < 0){
            if (negArray[abs(i.toInt())] == 1) {
                print("$i ")
            }
        }
    }
    println()

    return string
}