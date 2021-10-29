fun main(args: Array<String>) {
    var rectangulo1 = rectangulo(6, 8)
    println("El area de el rectangulo1 es: ${rectangulo1.Area()}")
    println("El perimetro de el rectangulo1 es: ${rectangulo1.Perimetro()}")
    var rectangulo2 = rectangulo(12, 3)
    println("El area de el rectangulo2 es: ${rectangulo2.Area()}")
    println("El perimetro de el rectangulo2 es: ${rectangulo2.Perimetro()}")
}

class rectangulo(var base: Int, var altura: Int) {
    fun Area(): Int {
        return base * altura
    }

    fun Perimetro(): Int {
        return (2 * base) + (2 * altura)

    }
}