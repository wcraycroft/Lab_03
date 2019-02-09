public class RightTriangle extends Triangle {

    public RightTriangle(double lengthA, double lengthB, double lengthC) {
        super(lengthA, lengthB, lengthC);

    }

    public String toString() {
        return "Right " + super.toString();
    }

}