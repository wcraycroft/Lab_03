import java.text.DecimalFormat;

public class Triangle extends Figure{
    private double lengthA;
    private double lengthB;
    private double lengthC;

    // Constructor
    public Triangle(double lengthA, double lengthB, double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    // Getters and Setters
    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public double getlengthC() {
        return lengthC;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    // Overrides parent, method which returns the integer 3
    public int getNumberOfSides() {
        return 3;
    }

    // Method calculates the perimeter of the triangle & uses setter method in Figure to store its value
    public void calculatePerimeter() {
        setPerimeter(lengthA + lengthB + lengthC);
    }

    // Method computes the area of the triangle and uses the setter method in Figure to store its value
    public void calculateArea() {

        // Halve the parameter for area formula
        double halfP = (lengthA + lengthB + lengthC)/2;

        //Heron's formula for calculating triangle's area
        setArea(Math.sqrt(halfP*(halfP-lengthA)*(halfP-lengthB)*(halfP-lengthC)));
    }

    // equals method
    public boolean equals(Object anObject) {
        if(anObject == null)
            return false;
        else if(getClass() != anObject.getClass())
            return false;
        else {
            Triangle other = (Triangle)anObject;
            return (lengthA == other.lengthA &&
                    lengthB == other.lengthB &&
                    lengthC == other.lengthC);
        }
    }

    // toString
    public String toString() {

        DecimalFormat df = new DecimalFormat("0.00");
        calculateArea();
        calculatePerimeter();
        return "Triangle has " + getNumberOfSides() + " sides, " + df.format(lengthA) + ", " + df.format(lengthB) + " and " + df.format(lengthC) + "\nIts perimeter is "
                + df.format(getPerimeter()) + " and its area is " + df.format(getArea());
    }

}