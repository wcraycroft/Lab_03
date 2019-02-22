/* RightTriangle.java
 * Author:  William Craycroft
 *          Daniil Berezhnyi
 *          Licol Havaiia
 * Module:  3
 * Project: Lab 3
 * Description: This class is used to store the dimensions of a Right Triangle, and calculate its area and perimeter.
 *
 *      Methods:
 *          Constructors:
 *              Parameterized constructor that takes in lengthA and lengthB. Call helper method to calculate third length
 *              and send it to parent class (Triangle).
 *          Setters and Getters for both lengths.
 *          Helper methods (Override parent class):
 *              calculateHypotenuse() - returns the length of the hypotenuse using lengthA and lengthB
 *          Other methods:
 *              toString() - appended by parent toString()
 *              equals(Object) - checks two Triangle objects for equals dimensions. Note the order of the parameters must match.
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class RightTriangle extends Triangle {

    public RightTriangle(double lengthA, double lengthB) {
        // Temporarily sets lengthC (hypotenuse) to 0.0
        super(lengthA, lengthB, 0.0);
        // Calculates hypotenuse and sets lengthC in parent
        calculateHypotenuse();
    }

    // Setters will override parent class setters
    public void setLengthA(double lengthA) {
        super.setLengthA(lengthA);
        calculateHypotenuse();
    }

    public void setLengthB(double lengthB) {
        super.setLengthB(lengthB);
        calculateHypotenuse();
    }

    // Helper method
    // Calculates and sets the hypotenuse (lengthC) in parent class using the pythagorean theorem equation
    public void calculateHypotenuse() {
        setLengthC(sqrt(pow(getLengthA(), 2) + pow(getLengthB(), 2)));
    }

    // toString()
    public String toString() {
        return "Right " + super.toString();
    }

}