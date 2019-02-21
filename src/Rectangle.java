import java.text.DecimalFormat;

public class Rectangle extends Figure {

    // Instantiate DecimalFormat
    DecimalFormat twoDP = new DecimalFormat("0.00");

    private double height = 0;
    private double width = 0;

    // Parameterized constructor
    public Rectangle(double newHeight, double newWidth) {
        setHeight(newHeight);
        setWidth(newWidth);
    }

    // Getters
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    // Setters
    public void setHeight(double newHeight){
        height = newHeight;
        calculatePerimeter();
        calculateArea();
    }
    public void setWidth(double newWidth) {
        width = newWidth;
        calculatePerimeter();
        calculateArea();
    }
    // Helper method, returns number of sides (4)
    public int getNumberOfSides() {
        return 4;
    }
    // Helper method calculatePerimeter
    public void calculatePerimeter() {
        super.setPerimeter((height + width) * 2);
    }
    // Helper method calculateArea
    public void calculateArea() {
        super.setArea(height * width);
    }

    // toString
    public String toString() {
        return "Rectangle has height " + twoDP.format(height)
                + " and width " + twoDP.format(width)
                + " (" + getNumberOfSides() + " sides)\n"
                + "Its perimeter is " + twoDP.format(getPerimeter())
                + " and its area is " + twoDP.format(super.getArea());
    }

    // equals
    public boolean equals(Object anObject) {
        if ((anObject == null) || getClass() != anObject.getClass())
            return false;
        Rectangle otherRectangle = (Rectangle) anObject;
        return (height == otherRectangle.height
                && width == otherRectangle.width);
    }

}
