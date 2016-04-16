/*
*  Author: Connor Baker
*  Version: 0.6a
*  Created: April 15, 2016
*  Last Updated: April 16, 2016
*
*  Description: A program that randomly fills in 0s and 1s into an n-by-n
*  matrix, prints the matrix, and finds rows and columns with the most 1s, using
*  two ArrayLists to store the row and column indicies with the most 1s.
*
*  TODO: Compare the values present in the array and find the one with the most
*  1s in it, via ArrayLists.
*
*  TODO: Fix how the array is printed.
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

    // Initialize the variable to hold the array size
    int n = 0;

    // Prompt the user to input the array size, n
    System.out.println("Enter the array size: ");
    n = sizeofArray.nextInt();

    // Create the array of size n^2
    int[][] array = new int[n][n];

    // Fill the array with integers, [0,1]
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = randomNumber();
      }
    }

    // Print the array
    System.out.println("The random array is: ");
    System.out.println(Arrays.deepToString(array));

    // Create the column ArrayList
    ArrayList<Integer> column = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        column.add(array[j][i]);
      }
    }

    // Create the row ArrayList
    ArrayList<Integer> row = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        row.add(array[i][j]);
      }
    }

    /*
     *  We know that there is a new column every n elements, and we know
     *  similarly that we must traverse the entirety of the ArrayList. In order
     *  to do this, we set i = 1 (which makes the modular math used here
     *  possible and easy), and we continue as long as i is less than the number
     *  of elements in the ArrayList + 1, which accounts for setting i = 1.
     *
     *  At the end of each column/row we check for sum1 larger than sum2, which
     *  would mean that the row just tallied has more 1s than the previous. If
     *  this is the case, we assign the current row to sum2, and iterate again.
     */

    // Initialize the variables that hold sums of columns
    int sum1 = 0;
    int sum2 = 0;
    int largestColumnIndex = 0;

    for (int i = 1; i < ((n * n) + 1); i++) {
      if ((i % n) == 0) {
        sum1 += column.get(i-1);
        if (sum1 > sum2) {
          sum2 = sum1;
          largestColumnIndex = 0; // Implement logic
        }
        sum1 = 0;
      } else {
        sum1 += column.get(i-1);
      }
    }

    // Recycle the variables that hold sums of rows
    sum1 = 0;
    sum2 = 0;
    int largestRowIndex = 0;

    for (int i = 1; i < ((n * n) + 1); i++) {
      if ((i % n) == 0) {
        sum1 += row.get(i-1);
        if (sum1 > sum2) {
          sum2 = sum1;
          largestRowIndex = 0; // Implement logic
        }
        sum1 = 0;
      } else {
        sum1 += row.get(i-1);
      }
    }

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
