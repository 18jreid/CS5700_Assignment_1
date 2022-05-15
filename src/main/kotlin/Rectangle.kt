import kotlin.math.abs

open class Rectangle(private var topRight: Point, private var bottomLeft: Point): Shape() {
    // Check if rectangles width and height are greater than 0, if not: throw IllegalArgumentException
    init {
        if (getWidth() <= 0) {
            throw IllegalArgumentException("Width cannot be 0")
        } else if (getHeight() <= 0) {
            throw IllegalArgumentException("Height cannot be 0")
        }
    }

    /***
     * returns top right corner point of rectangle
     */
    fun getTopRightPoint(): Point {
        return this.topRight
    }

    /***
     * returns bottom left corner point of rectangle
     */
    fun getBottomLeftPoint(): Point {
        return this.bottomLeft
    }

    /***
     * calculates the width of the rectangle based off of the change in x between the two points given
     */
    fun getWidth(): Double {
        return abs(this.topRight.getXCoordinate() - this.bottomLeft.getXCoordinate());
    }

    /***
     * calculates the height of the rectangle based off of the change in y between the two points given
     */
    fun getHeight(): Double {
        return abs(this.topRight.getYCoordinate() - this.bottomLeft.getYCoordinate());
    }

    /***
     *
     * Calculates area of rectangle with formula base times height
     */
    override fun calculateArea(): Double {
        return (this.getWidth() * this.getHeight())
    }

    /***
     * Moves rectangle based off of desired deltaX and deltaY
     */
    override fun move(deltaX: Double, deltaY: Double) {
        this.topRight.movePoint(deltaX, deltaY)
        this.bottomLeft.movePoint(deltaX, deltaY)
    }
}