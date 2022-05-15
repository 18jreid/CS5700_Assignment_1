import kotlin.math.pow
import kotlin.math.sqrt

class Line(startPoint: Point, endPoint: Point) {
    // Check if line length is less than zero, if so: throw error
    init {
        if (getLength() <= 0) {
            throw IllegalArgumentException("Line length is less that zero")
        }
    }
    var startPoint: Point = startPoint;
    var endPoint: Point = endPoint;

    /***
     * calculates and returns the slope of the line using the slope formula (y_2 - y_1) / (x_2 - x_1)
     *
     * returns: slope of type Double
     */
    fun getSlope(): Double {
        val numerator = endPoint.getYCoordinate() - startPoint.getYCoordinate();
        val denominator = endPoint.getXCoordinate() - startPoint.getXCoordinate();

        return numerator / denominator;
    }

    /***
     * calculates and returns the length of the line using the distance formula sqrt((x_2^2 - x_1^2) + (y_2^2 - y_1^2))
     *
     * returns: length of type Double
     */
    fun getLength(): Double {
        val x = (endPoint.getXCoordinate() - startPoint.getXCoordinate()).pow(2);
        val y = (endPoint.getYCoordinate() - startPoint.getYCoordinate()).pow(2);

        return sqrt(x + y);
    }

    /***
     * moves the line according to deltaX and deltaY values
     */
    fun moveLine(deltaX: Double, deltaY: Double) {
        this.endPoint.movePoint(deltaX, deltaY)
        this.startPoint.movePoint(deltaX, deltaY)
    }
}