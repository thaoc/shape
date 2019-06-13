package shapes;

/**
 * Square class
 * @author Paul
 */
public class Square implements IShape {
    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }
    
    /**
     * Length of the square
     */
    private double length;
    
    /**
     * Initialize a square
     * @param length length of the square
     */
    public Square(double length) {
        this.length = length;
    }
}
