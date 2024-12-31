fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val listCopy = list.toMutableList() // Create a copy to avoid ConcurrentModificationException
    listCopy.removeIf { it > 2 }
    println(listCopy) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val setCopy = set.toMutableSet()
    setCopy.removeIf { it > 2 }
    println(setCopy) // Output: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val mapCopy = map.toMutableMap()
    mapCopy.removeIf { it.key > 2 }
    println(mapCopy) // Output: {1=one, 2=two}
}
