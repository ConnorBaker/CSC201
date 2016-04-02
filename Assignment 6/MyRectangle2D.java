/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: March 30, 2016
*  Last Updated: April 1, 2016
*
*  Description: Book Assignment 10.13, from "Introduction to Java Programming:
*  Brief Version, 10th Edition" by Y. Daniel Liang.
*/

public class MyRectangle2D {
  // Initialize the coordinate values to 0.0
  double x = 0.0;
  double y = 0.0;

  // Initialize the width and height values to 0.0
  double width = 0.0;
  double height = 0.0;

  // Create the rectangle object
  Rectangle() {
    // Empty
  }

  // Construct the rectangle object
  Rectangle(double newWidth, newHeight) {
    width = newWidth;
    height = newHeight;
  }

  // Set width
  double setWidth() {

  }

  // Get width
  double getWidth() {
    return width;
  }

  // Set height
  double setHeight() {

  }

  // Get height
  double getHeight() {
    return height;
  }

  // Set x-coordinate
  double setX() {

  }

  // Get x-coordinate
  double getX() {
    return x;
  }

  // Set y-coordinate
  double setY() {

  }

  // Get y-coordinate
  double getY() {
    return y;
  }

  // Get area of the rectanlge
  double getArea() {
    return (width * height);
  }

  // Get perimeter of the rectangle
  double getPerimeter() {
    return ((2*width) + (2*height));
  }

}
