/* Square.java
 * Author:  William Craycroft
 *          Daniil Berezhnyi
 *          Licol Havaiia
 * Module:  3
 * Project: Lab 3
 * Description: This class is used to store the dimensions of a Square.
 *
 *      Methods:
 *          Constructors:
 *              Parameterized constructor that takes in length and sends it to parent constructor.
 *          Setters and Getters for length
 *          Other methods:
 *              toString() - Displays length, number of sides, perimeter and area
 *              equals(Object) - Checks two square objects for equal length
 */

import java.text.DecimalFormat;

public class Square extends Rectangle {

    // Instantiate DecimalFormat
    DecimalFormat twoDP = new DecimalFormat("0.00");

    public Square (double length) {
        super(length, length);
    }

    public double getLength() {
        return getHeight();
    }

    public void setLength(int length) {
        setWidth(length);
        setHeight(length);
    }

    public String toString() {
        return "Square has sides " + twoDP.format(getHeight())
                + " (" + getNumberOfSides() + " sides)\n"
                + "Its perimeter is " + twoDP.format(getPerimeter())
                + " and its area is " + twoDP.format(super.getArea());
    }

    public boolean equals(Object anObject) {
        if ((anObject == null) || getClass() != anObject.getClass())
            return false;
        Square otherSquare = (Square) anObject;
        return getLength() == otherSquare.getLength();
    }
}
