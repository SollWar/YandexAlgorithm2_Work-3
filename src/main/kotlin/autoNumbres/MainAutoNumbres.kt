package autoNumbres

import java.lang.Integer.max

fun main() {
    val m = readLine()!!.toInt()
    var input: String
    val witness = arrayListOf<Set<Char>>() // Список символов свидетелей
    repeat (m) {
        input = readLine()!!
        witness.add(input.toSet()) // Целиком строку в сет
    }

    val n = readLine()!!.toInt()
    val nums = mutableMapOf<String, Int>() // Список номеров и их совпадений со свидетелями
    var watcher = 0 // Текущее кол-во совпавших
    var maxWatcher = 0 // Максимальное кол-во совпавших
    repeat (n) {
        input = readLine()!!

        for (wit in witness) {
            if (input.toSet().containsAll(wit)) { // Превращаем строку в сет Char и см. содержит ли она свидетеля
                watcher++
            }
        }
        maxWatcher = max(watcher, maxWatcher)
        nums += input to watcher // Сохраняем номер и кол-во совпадений

        watcher = 0
    }

    for (it in nums) {
        if (it.value == maxWatcher)
            println(it.key)
    }
}

