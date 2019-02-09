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
                + " (" + getNumberOfSide() + " sides)\n"
                + "Its perimeter is " + twoDP.format(getPerimeter())
                + " and its area is " + twoDP.format(super.getArea());
    }

    public boolean equals(Object anObject) {
        return super.equals(anObject);
    }
}
