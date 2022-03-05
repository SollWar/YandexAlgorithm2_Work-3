package metnum

import java.io.File

fun main() {
    val str = readLine()!!.split(" ")

    println(metnum(str))
}

fun metnum(str: List<String>): StringBuffer {
    val out: StringBuffer = StringBuffer()
    val set: HashSet<Int> = hashSetOf()

    for (i in str) {
        if (i != "") out.append(if (set.add(i.toInt())) "NO\n" else "YES\n")
    }

    return out
}