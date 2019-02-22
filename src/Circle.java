/* Circle.java
 * Author:  William Craycroft
 *          Daniil Berezhnyi
 *          Licol Havaiia
 * Module:  3
 * Project: Lab 3
 * Description: This class is used to store the dimensions of a Circle, and calculate its area and perimeter.
 *
 *     Instance variables:
 *          radius (double) - the radius of the Circle
 *
 *      Methods:
 *          Constructors:
 *              Parameterized constructor that takes in radius (double).
 *          Setters and Getters for radius
 *          Helper methods (Override parent class):
 *              calculatePerimeter() - calculates the perimeter of the Circle
 *              calculateArea() - calculates the area of the Circle
 *          Other methods:
 *              toString() - displays radius, area and perimeter
 *              equals(Object) - checks two Circle objects for equals radius
 */

import java.text.DecimalFormat;
import java.lang.Math;

public class Circle extends Figure
{
    // Instance variables
    private double radius;

    // Get/Set methods
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double inputRadius)
    {
        this.radius = inputRadius;
    }

    // Constructor(s)
    public Circle(double radius)
    {
        setRadius(radius);
    }

    // Calculating perimeter
    public void calculatePerimeter()
    {
        setPerimeter(radius * 2 * Math.PI);
    }

    // Calculating area
    public void calculateArea()
    {
        setArea(radius * radius * Math.PI);
    }

    // toString method
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.##");

        return "Circle has radius " + df.format(radius) + "\n" +
                "Its perimeter is " + df.format(getPerimeter()) +
                " and its area is " + df.format(getArea());
    }

    // Equals method
    public boolean equals(Object anObject)
    {
        if ((anObject == null) || getClass() != anObject.getClass())
        {
            return false;
        }
        Circle otherCircle = (Circle) anObject;
        return radius == otherCircle.getRadius();
    }

    // Calculated values
    //double circumference = (2 * Math.PI * radius);
    //double area = (Math.PI * radius * radius);

}