/*
*  Author: Connor Baker
*  Version: 0.3a
*  Created: March 30, 2016
*  Last Updated: April 2, 2016
*
*  Description: Book Assignment 10.13, from "Introduction to Java Programming:
*  Brief Version, 10th Edition" by Y. Daniel Liang.
*
*  TODO: Fix contains(MyRectangle2D r) so that it works.
*
*  TODO: Fix contains(double newX, double newY) so that it works.
*/

public class MyRectangle2D {
  // Initialize the coordinate values to 0.0
  double x = 0.0;
  double y = 0.0;

  // Initialize the width and height values to 0.0
  double width = 0.0;
  double height = 0.0;

  // Initialize the bounds
  double lbx = 0.0; // Lower bound of x
  double ubx = 0.0; // Upper bound of x
  double lby = 0.0; // Lower bound of y
  double uby = 0.0; // Upper bound of y

  // Default constructor of the rectangle object
  MyRectangle2D() {
    x = 0.0;
    y = 0.0;
    width = 1.0;
    height = 1.0;
  }

  // Construct the rectangle object
  MyRectangle2D(double newX, double newY, double newWidth, double newHeight) {
    x = newX;
    y = newY;
    width = newWidth;
    height = newHeight;
  }

  // Set width
  void setWidth(double newWidth) {
    width = newWidth;
  }

  // Get width
  double getWidth() {
    return width;
  }

  // Set height
  void setHeight(double newHeight) {
    height = newHeight;
  }

  // Get height
  double getHeight() {
    return height;
  }

  // Set x-coordinate
  void setX(double newX) {
    x = newX;
  }

  // Get x-coordinate
  double getX() {
    return x;
  }

  // Set y-coordinate
  void setY(double newY) {
    y = newY;
  }

  // Get y-coordinate
  double getY() {
    return y;
  }

  // Get area of the rectangle
  double getArea() {
    return (width * height);
  }

  // Get perimeter of the rectangle
  double getPerimeter() {
    return ((2*width) + (2*height));
  }

  // Check if a point is inside a rectangle
  boolean contains(double newX, double newY) {
    lbx = (0.5 * width) - x;
    ubx = (0.5 * width) + x;
    lby = (0.5 * height) - y;
    uby = (0.5 * height) + y;
    System.out.println(lbx);
    System.out.println(ubx);
    System.out.println(lby);
    System.out.println(uby);
    if (((newX >= lbx) && (newX <= ubx)) && ((newY >= lby) && (newY <= uby))) {
      return true;
    } else {
      return false;
    }
  }

  // Check if a rectangle is inside another rectangle
  boolean contains(MyRectangle2D r) {
    if ((x >= width) || (y >= height)) {
      return false;
    } else {
      return true;
    }
  }
}
