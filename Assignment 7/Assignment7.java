/*
*  Author: Connor Baker
*  Version: 0.5a
*  Created: April 15, 2016
*  Last Updated: April 15, 2016
*
*  Description: A program that randomly fills in 0s and 1s into an n-by-n
*  matrix, prints the matrix, and finds rows and columns with the most 1s, using
*  two ArrayLists to store the row and column indicies with the most 1s.
*
*  TODO: Compare the values present in the array and find the one with the most
*  1s in it, via ArrayLists.
*/

// Import necessary packages
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Assignment7 {

  public static void main(String[] args) {
    // Print author name
    System.out.println("Connor Baker");

    // Initialize the scanner to grab input
    Scanner sizeofArray = new Scanner(System.in);

    // Initialize the int to hold the array size
    int n = 0;

    // Prompt the user to input the array size, n
    System.out.println("Enter the array size: ");
    n = sizeofArray.nextInt();

    // Create the array of size n^2
    int[][] array = new int[n][n];

    // Fill the array with integers, [0,1]
    for (int i = 0; i < n; i ++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = randomNumber();
      }
    }

    // Print the array
    System.out.println("The random array is: ");
    System.out.println(Arrays.deepToString(array));

    // Print the information gathered from the array
    System.out.println("The largest row index: ");
    System.out.println("The largest column index: ");
  }

  public static int randomNumber() {
    // Fill the array
    Random r = new Random();
    int randomNumber = r.nextInt(2); // This yeilds numbers [0,1]
    return randomNumber;
  }
}
