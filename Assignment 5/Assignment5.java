/*
*  Author: Connor Baker
*  Version: 0.9a
*  Created: March 19, 2016
*  Last Updated: March 23, 2016
*
*  Description: Read data from given files (passed in through command line),
*  create arrays that model the data from the files, and calculate the number of
*  vertical, horizontal, and diagonal matches found.
*/

// Import necessary packages
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Assignment5 {

  public static void main(String[] args) throws FileNotFoundException {
    // Print author name
    System.out.println("Connor Baker");

    // Check for args passed via the command line
    if (args.length == 0) {
      // If no arguments are present, print a warning
      System.out.println("Please input the files (with extension) to process.");
    } else {
      // Create two int values to hold length and width
      int x = 7;
      int y = 6;

      // For each argument, look for a corresponding file of the same name
      for (int i = 0; i < args.length; i++) {
        // Populate the array
        Scanner inputFile = new Scanner(new FileReader(args[i]));
        int[][] array = new int[y][x];
        for (int j = 0; j < array.length; j++) {
          for (int k = 0; k < array[j].length; k++) {
            array[j][k] = inputFile.nextInt();
          }
        }
        inputFile.close();

        // Check the newly created array for a pattern
        boolean match = isConsecutiveFour(array);

        // Print if a match was found
        if (match == true) {
          System.out.println("There was a match found for " + args[i]);
        }
        else {
          System.out.println("There was no match found in " + args[i]);
        }
      }
    }
  }

  public static boolean isConsecutiveFour(int[][] array) {
    // Initialize int values to hold number of matches
    int x = 0; // Number of horizontal matches
    int y = 0; // Number of vertical matches
    int z = 0; // Number of diagonal matches

    // Find horizontal matches
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < (array[i].length - 3); j++) {
        if ((array[i][j]==array[i][j+1]) && (array[i][j]==array[i][j+2]) && (array[i][j]==array[i][j+3])) {
          // We have a match
          x++;
        }
      }
    }

    // Find vertical matches
    for (int i = 0; i < (array.length - 3); i++) {
      for (int j = 0; j < array[i].length; j++) {
        if ((array[i][j]==array[i+1][j]) && (array[i][j]==array[i+2][j]) && (array[i][j]==array[i+3][j])) {
          // We have a match
          y++;
        }
      }
    }

    // Find diagonal matches
    for (int i = 0; i < (array.length - 3); i++) {
      for (int j = 0; j < (array[i].length - 3); j++) {
        if ((array[i][j]==array[i+1][j+1]) && (array[i][j]==array[i+2][j+2]) && (array[i][j]==array[i+3][j+3])) {
          // We have a match
          z++;
        }
      }
    }

    // Print out the results we found
    System.out.println("Horizontal matches found: " + x);
    System.out.println("Vertical matches found: " + y);
    System.out.println("Diagonal matches found: " + z);

    // Return the results
    if ((x != 0) || (y != 0) || (z != 0)) {
      return true;
    } else {
      return false;
    }
  }
}
