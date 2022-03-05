package multiplicity

class SimpleHash<E> {
    private val mass: Array<ArrayList<Int>> = Array(10) { arrayListOf() } // Двумерный массив.
                                                                              // Массив массивов типа Int
    //class SimpleHash<E> - E тип который можно указать при создании объекта класса

    fun add(element: Int) {
        if (!find(element)) mass[element % 10].add(element) // если не проверять на содержание, то будет мульти-множество
    }

    fun find(element: Int): Boolean {
        for (it in mass[element % 10]) {
            if (it == element) return true
        }
        return false
    }

    fun delete(element: Int) {
        val massX = mass[element % 10]
        for (it in massX.indices) {
            if (massX[it] == element) {
                massX[it] = massX[massX.size - 1]
                massX.removeLast()
                return
            }
        }
    }
}