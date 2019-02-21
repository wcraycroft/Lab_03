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