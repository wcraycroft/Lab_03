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
 *      1. Create an array of size 6 with variable type Figure
 *      2. Instantiate two Rectangle objects, one Square object, one Triangle object, two Circle objects,
 *      3. For each element in Movie array, call the object's toString and calcLateFees methods for 5 late days.
 *      4. Expected results in order should be Movie=10.0, Action=15.0, Comedy=12.5, Drama=10.0
 */

public class LabDemo {

    public static void main (String[] args){

        // Declare array of 6 Figure objects
        Figure[] figures = new Figure[7];

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
        // Instantiate Right Triangle
        figures[6] = new RightTriangle(5.0, 12, 13);


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
        // Compare Triangle at element 3 with Square in element 2
        System.out.println("  Triangle 4 is " + (figures[3].equals(figures[2]) ? "" : "not ")
                + "equals to Square 3.");
    }
}
