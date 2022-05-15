class Square(topRight: Point, bottomLeft: Point) : Rectangle(topRight, bottomLeft) {
    // Check if width and height are equal
    init {
        if (getWidth() != getHeight()) {
            throw IllegalArgumentException("Rectangle width and height are not equal, therefore it isn't a cube!")
        }
    }
}