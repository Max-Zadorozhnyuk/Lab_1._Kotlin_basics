class Product(val price: Double) {
    init {
        if (price < 0.0) {
            throw IllegalArgumentException("Price cannot be negative")
        }
    }
}