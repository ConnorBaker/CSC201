/*
*  Author: Connor Baker
*  Version: 0.2a
*  Created: March 30, 2016
*  Last Updated: April 2, 2016
*
*  Description: Book Assignment 10.13, from "Introduction to Java Programming:
*  Brief Version, 10th Edition" by Y. Daniel Liang.
*
*  TODO: Fix contains(MyRectangle2D r) so that it actually works.
*/

public class MyRectangle2D {
  // Initialize the coordinate values to 0.0
  double x = 0.0;
  double y = 0.0;

  // Initialize the width and height values to 0.0
  double width = 0.0;
  double height = 0.0;

  // Create the rectangle object
  MyRectangle2D() {
    // Empty
  }

  // Construct the rectangle object
  MyRectangle2D(double newWidth, double newHeight) {
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
  boolean contains(double x, double y) {
    if ((x >= width) || (y >= height)) {
      return false;
    } else {
      return true;
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
