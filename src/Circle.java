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

    // Calculated values
    // double circumference = (2 * Math.PI * radius);
    //double area = (Math.PI * radius * radius);

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

        if(radius == otherCircle.getRadius())
        {
            return true;
        }
        else
        {
            return false;
        }
    }






}