/*
*  Author: Connor Baker
*  Version: 0.4a
*  Created: March 30, 2016
*  Last Updated: April 2, 2016
*
*  Description: Book Assignment 10.13, from "Introduction to Java Programming:
*  Brief Version, 10th Edition" by Y. Daniel Liang.
*
*  Geometry: the MyRectangle2D class
*
*  Define it so that it contains:
*
*  Two double data fields names x and y that specify the center of the rectangle
*  with getter and setter methods. (Assume that the rectangle sides are parallel
*  to the x-or-y axes.)
*
*  The data fields width and height with getter and setter methods.
*
*  A no-arg constructor that creates a default rectangle with (0,0) for (x,y) and
*  1 for both width and height.
*
*  A constructor that creates a rectangle with the specified x, y , width, and
*  height.
*
*  A method getArea() that returns the area of the rectangle.
*
*  A method getPerimeter() that returns the perimeter of the rectangle.
*
*  A method contains(double x, double y) that returns true if the specified
*  point (x,y) is inside the rectangle.
*
*  A method contains(MyRectangle2D r) that returns true if the specified
*  rectangle is inside this rectangle.
*
*  A method overlaps(MyRectangle2D r) that returns true if the specified
*  rectangle overlaps with this rectangle.
*
*  Special Requirements:
*  Name your class "MyRectangle2D.java"
*  Make the "no argument" constructor of your class output your first and last
*  name.
*  Write methods getX, getY, getWidth, getHeight that return the appropriate
*  property.
*  Write methods setX, setY, setWidth, setHeight that set the appropriate
*  property.
*  The "overlaps" method is not required.  If you do it, you can earn up to 5
*  points extra credit.
*
*  TODO: Check for negative lengths.
*/

public class Assignment6 {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Connor Baker");
      MyRectangle2D noargRectangle = new MyRectangle2D();
    } else if (args.length == 4) {
      MyRectangle2D argRectangle = new MyRectangle2D(Double.parseDouble(args[0]),
                    Double.parseDouble(args[1]),
                    Double.parseDouble(args[2]),
                    Double.parseDouble(args[3]));
    } else {
      System.out.println("Incorrect number of arguments.");
      System.out.println("Accepted arguments are x y width height");
      System.out.println("Example:");
      System.out.println("java Assignment6 1.0 2.0 3.0 4.0");
    }
  }
}
