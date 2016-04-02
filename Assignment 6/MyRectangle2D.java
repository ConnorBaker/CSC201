/*
*  Author: Connor Baker
*  Version: 0.4a
*  Created: March 30, 2016
*  Last Updated: April 2, 2016
*
*  Description: Book Assignment 10.13, from "Introduction to Java Programming:
*  Brief Version, 10th Edition" by Y. Daniel Liang.
*
*  TODO: Check that all methods work.
*
*  TODO: Implement overlaps method.
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

  // Initialize the bounds used in the contains method
  double newLbx = 0.0;
  double newUbx = 0.0;
  double newLby = 0.0;
  double newUby = 0.0;

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
    return ((2 * width) + (2 * height));
  }

  // Check if a point is inside a rectangle
  boolean contains(double newX, double newY) {
    // Compute the bounds
    lbx = x - (0.5 * width);
    ubx = x + (0.5 * width);
    lby = y - (0.5 * height);
    uby = y + (0.5 * height);

    // Check if the point is inside the bounds
    if (((newX >= lbx) && (newX <= ubx)) && ((newY >= lby) && (newY <= uby))) {
      return true;
    } else {
      return false;
    }
  }

  // Check if a rectangle is contained by another rectangle
  boolean contains(MyRectangle2D r) {
    // Compute the bounds
    lbx = x - (0.5 * width);
    ubx = x + (0.5 * width);
    lby = y - (0.5 * height);
    uby = y + (0.5 * height);

    // Get the values for the rectangle to check
    double newX = r.getX();
    double newY = r.getY();
    double newWidth = r.getWidth();
    double newHeight = r.getHeight();

    // Compute the bounds for the rectangle to check
    newLbx = newX - (0.5 * newWidth);
    newUbx = newX + (0.5 * newWidth);
    newLby = newY - (0.5 * newHeight);
    newUby = newY + (0.5 * newHeight);

    // Check if the rectangle is within the bounds
    if (((newLbx < lbx) || (newUbx > ubx)) || ((newLby < lby) || (newUby > uby))) {
      return false;
    } else {
      return true;
    }
  }
}
