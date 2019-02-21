/* LabDemo.java
 * Authors: William Craycroft
 *          Daniil Berezhnyi
 *          Licol Havaiia
 * Module:  3
 * Project: Lab 3
 * Problem Statement: This class demonstrates the functionality of the Figure parent class and its descendant classes
 *      Circle, Rectangle, Square, Triangle and Right Triangle.
 *
 * Algorithm / Plan:
 *      1. Create an array of size 8 with variable type Figure.
 *      2. Instantiate 2 Rectangle objects, 1 Square object, 1 Triangle object, 2 Circle objects, 2 Right Triangle objects
 *      3. For each element in figures array:
 *              call calculateArea() and calculatePerimeter() methods.
 *              print the object using its toString() method.
 *      4. Compare elements 0 and 1 of the figures array using equals() method. Interpret the return value as a string.
 *      5. Compare elements 4 and 5 of the figures array using equals() method. Interpret the return value as a string.
 *      6. Compare elements 3 and 2 of the figures array using equals() method. Interpret the return value as a string.
 *      7. Cast the Figure in element 6 as a RightTriangle, print its toString().
 *      8. Use RightTriangle mutator methods to set legs to 6.0 and 8.0. Print its revised toString().
 *
 * Lab Questions:
 *      1. Is the default (no-arg) constructor for the Figure class necessary?  How can you get around providing this?
 *              Because there are not other constructors in the Figure class, Java will implicitly declare one with the
 *              default values of 0.0 for both member variables. The current constructor is not needed.
 *      2. What methods does the Square class inherit from Figure?  Which does it inherit from Rectangle?
 *              The Square class inherits the getters and setters for area and perimeter from the Figure class.
 *              From the Rectangle class, it inherits the calculateArea(), calculatePerimeter(), getNumberOfSides(),
 *              getters and setters for width and height.
 *      3. How would you change the design of this lab so that the perimeter and area of the object being created or
 *       modified are always correct (without having to invoke calculatePerimeter and calculateArea)?  Do you remember
  *      what this condition is called?
  *             You could do so by adding a call to the calculateArea() and calculatePerimeter() methods in every
  *             setter method of each child class and any parameterized constructors. This will ensure that any change
  *             to a figure's dimensions will also calculate a change in its area and perimeter. We have heard this
  *             type of condition referred to as a "side-effect".
 */

public class LabDemo {

    public static void main (String[] args){

        // Declare array of 8 Figure objects
        Figure[] figures = new Figure[8];

        // Instantiate two Rectangle objects
        figures[0] = new Rectangle(10.3, 8.0);
        figures[1] = new Rectangle(10.3, 8.0);
        // Instantiate Square
        figures[2] = new Square(20.0);
        // Instantiate Triangle
        figures[3] = new Triangle(6.5, 14.9, 11.3);
        // Instantiate two Circles
        figures[4] = new Circle(4.31);
        figures[5] = new Circle(8.15);
        // Instantiate two Right Triangles
        figures[6] = new RightTriangle(3.0, 4.0);
        figures[7] = new RightTriangle(5.0, 12.0);


        // Loop through Figure array
        for (int i = 0; i < figures.length; i++) {
            /* Call perimeter and area calculation.
               This is redundant for classes that already call these methods in their setters */
            figures[i].calculatePerimeter();
            figures[i].calculateArea();
            // Print the figure number, then call toString for each object
            System.out.println("Figure " + (i + 1) + ": " + figures[i].toString());
            System.out.println();
        }
        // Test equals() methods
        System.out.println("Test equals() methods");
        // Compare Rectangles at element 0 and 1
        System.out.println("  Rectangle 1 is " + (figures[0].equals(figures[1]) ? "" : "not ")
                + "equals to Rectangle 2.");
        // Compare Circles at element 4 and 5
        System.out.println("  Circle 5 is " + (figures[4].equals(figures[5]) ? "" : "not ")
                + "equals to Circle 6.");
        // Compare Circle at element 5 to itself
        System.out.println("  Circle 5 is " + (figures[4].equals(figures[4]) ? "" : "not ")
                + "equals to Circle 5.");
        // Compare Triangle at element 3 with Square in element 2
        System.out.println("  Triangle 4 is " + (figures[3].equals(figures[2]) ? "" : "not ")
                + "equals to Square 3.");

        // Test right-triangle reassignment
        System.out.println("\nTest right-triangle reassignments");
        // We need access to setters, so create new RightTriangle object by downcasting figure[6]
        RightTriangle newRightTriangle = (RightTriangle) figures[6];
        // Print original RightTriangle
        System.out.println("  Original: " + newRightTriangle.toString());
        // Set legs to 6.0 and 8.0
        newRightTriangle.setLengthA(6.0);
        newRightTriangle.setLengthB(8.0);
        // Print revised RightTriangle
        System.out.println("  Revised: " + newRightTriangle.toString());
    }
}
