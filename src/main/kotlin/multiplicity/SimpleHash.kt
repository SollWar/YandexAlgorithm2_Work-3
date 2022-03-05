package multiplicity

//class SimpleHash<E> - E тип который можно указать при создании объекта класса
class SimpleHash {
    private var setsize = 10
    private val mass: Array<ArrayList<Int>> = Array(setsize) { arrayListOf() } // Двумерный массив.
                                                                              // Массив массивов типа Int
    // [element % setsize] - хеш-функция

    fun add(element: Int) {
        if (!find(element)) mass[element % setsize].add(element) // если не проверять на содержание, то будет мульти-множество
    }

    fun find(element: Int): Boolean {
        for (it in mass[element % setsize]) {
            if (it == element) return true
        }
        return false
    }

    fun delete(element: Int) {
        val massX = mass[element % setsize]
        for (it in massX.indices) {
            if (massX[it] == element) {
                massX[it] = massX[massX.size - 1]
                massX.removeLast()
                return
            }
        }
    }
}