/* Figure.java
 * Author:  William Craycroft
 *          Daniil Berezhnyi
 *          Licol Havaiia
 * Module:  3
 * Project: Lab 3
 * Description: Abstract parent class which manipulates data about a nondescript figure
 *
 *      Instance variables:
 *          perimeter (double) - the diameter or circumference of the figure
 *          area (double) - the area of the figure
 *
 *      Methods:
 *          Constructors
 *              Default constructor sets instance variables to 0.0
 *          setters and getters for all instance variables
 *          Abstract methods
 *              toString()
 *              equals(Object)
 *              calculatePerimeter()
 *              calculateArea()
 *          getNumberOfSides() - returns 0 for Figure class, overridden in children
 */

public abstract class Figure {

    // Member variables
    private double perimeter;
    private double area;

    // Default constructor
    public Figure() {
        setPerimeter(0.0);
        setArea(0.0);
    }

    // Getters
    public double getPerimeter() {
        return perimeter;
    }
    public double getArea() {
        return area;
    }

    // Setters
    public void setPerimeter(double newPerimeter) {
        perimeter = newPerimeter;
    }
    public void setArea (double newArea) {
        area = newArea;
    }

    // Abstract toString and equals
    public abstract String toString();
    public abstract boolean equals(Object anObject);

    // Abstract helper methods
    public abstract void calculatePerimeter();
    public abstract void calculateArea();

    // Return 0 sides by default. Overridden in Rectangle and Triangle classes.
    public int getNumberOfSides() {
        return 0;
    }



}
