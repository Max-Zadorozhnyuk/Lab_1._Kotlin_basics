class Rectangle(val width: Int, val height: Int) {
    // Вторинний конструктор делегує виклик первинному через : this(...)
    constructor(size: Int) : this(size, size)
}

fun createSquare(): Int {
    val square = Rectangle(5)
    return square.width * square.height
}