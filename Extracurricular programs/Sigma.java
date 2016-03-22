/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: March 3, 2016
*  Last Updated: March 22, 2016
*
*  Description: Solves a predetermined sigma equation.
*
*  TODO: Make a way for the user to input the equation to solve.
*/

// Import necessary packages
import java.util.Scanner;
import java.lang.Math;

public class Sigma { // start class

  public static void main(String args[]) { // start main method

    // Ask the user to input the iteration count
    System.out.println("Put in k");
    Scanner input = new Scanner(System.in);
    int k = input.nextInt();

    // Ask the user to input the number of iterations to stop at
    System.out.println("Put in the upper limit");
    int j = input.nextInt();

    System.out.println("\n");

    // Initialize the double that holds the answer
    double value = 0.0;

    // Process the sigma
    while (k < j) {
      value = 1/((double)k);
      System.out.println(value);
      k++;
    }
  }
}
