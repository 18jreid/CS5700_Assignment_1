fun main(args: Array<String>) {
    val mySquare: Square = Square(Point(0.0, 0.0), Point(5.0, 5.0));
    val circle: Circle = Circle(Point(0.0, 0.0), 5.0, 5.0)
    val triangle: Triangle = Triangle(Point(0.0, 0.0), Point(0.0, 1.0), Point(5.0, 0.0))

    println(triangle.calculateArea())
}