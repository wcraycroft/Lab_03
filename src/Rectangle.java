/* Rectangle.java
 * Author:  William Craycroft
 *          Daniil Berezhnyi
 *          Licol Havaiia
 * Module:  3
 * Project: Lab 3
 * Description: This class is used to store the dimensions of a Rectangle and calculate its area and perimeter.
 *
 *      Instance variables:
 *          height (double) - the height of the Rectangle
 *          width (double) - the width of the Rectangle
 *
 *      Methods:
 *          Constructors:
 *              Parameterized constructor that takes in width and height as doubles.
 *          Setters and Getters for width and height
 *          Helper methods (Override parent class):
 *              calculatePerimeter() - calculates the perimeter of the Rectangle
 *              calculateArea() - calculates the area of the Rectangle
 *              getNumberOfSides() - returns the number of sides (4)
 *          Other methods:
 *              toString() - displays height, width, number of sides, area and perimeter
 *              equals(Object) - checks two Rectangle objects for equals height and width
 */

import java.text.DecimalFormat;

public class Rectangle extends Figure {

    // Instantiate DecimalFormat
    DecimalFormat twoDP = new DecimalFormat("0.00");

    private double height = 0.0;
    private double width = 0.0;

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
