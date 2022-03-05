package multiplicity

fun main() {
    val testHash: SimpleHash = SimpleHash()
    testHash.add(3)
    println(testHash.find(3))
    println(testHash.find(4))
    testHash.delete(3)
    println(testHash.find(3))
}