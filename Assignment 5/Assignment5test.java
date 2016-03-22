/*
*  Author: Connor Baker
*  Version: 0.8b
*  Created: March 19, 2016
*  Last Updated: March 21, 2016
*
*  Description: Read data from given files (passed in through command line),
*  create arrays that model the data from the files, and calculate the number of
*  vertical, horizontal, and diagonal matches found.
*
*  TODO: Fix both of the pattern searches.
*
*  TODO: Implement capability for isConsecutiveFour print what the match was.
*
*  TODO: Fix the horizontalLengthOfFile method to stop at a linebreak.
*
*  TODO: Detect what datatype the input files are using and adjust accordingly.
*
*  TODO: Implement a solution to handle inputs that would yield ragged arrays.
*/

// Import necessary packages
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Assignment5test {

  public static void main(String[] args) throws FileNotFoundException {
    // Print author name
    System.out.println("Connor Baker");

    // Check for args passed via the command line
    if (args.length == 0) {
      // If no arguments are present, print a warning
      System.out.println("Please input the files (with extension) to process.");
    } else {
      // Create two int values to hold length and width
      int x;
      int y;

      // For each argument, look for a corresponding file of the same name
      for (int i = 0; i < args.length; i++) {
        // Determine the width of the array to make
        Scanner inputFile = new Scanner(new FileReader(args[i]));
        // Fix this later
        // x = horizontalLengthOfFile(inputFile);
        // System.out.println("Number of elements per line is: " + x);

        x = 7;
        System.out.println("Number of elements per line is: " + x);
        inputFile.close();

        // Determine the length of the array to make
        inputFile = new Scanner(new FileReader(args[i]));
        y = verticalLengthOfFile(inputFile);
        System.out.println("Number of lines is: " + y);

        // Populate the array
        inputFile = new Scanner(new FileReader(args[i]));
        int[][] array = new int[y][x];
        for (int j = 0; j < array.length; j++) {
          for (int k = 0; k < array[j].length; k++) {
            array[j][k] = inputFile.nextInt();
          }
        }
        inputFile.close();

        // Check the newly created array for a pattern
        boolean match = isConsecutiveFour(array);

        System.out.println("match existed? "+match);
        System.out.println("i is "+i);
      }
    }
  }

  public static boolean isConsecutiveFour(int[][] array) {
    int x = 0; // Number of horizontal matches
    boolean existsHorizontalMatch = false;
    int y = 0; // Number of vertical matches
    boolean existsVerticaltalMatch = false;
    int z = 0; // Number of diagonal matches
    boolean existsDiagonalMatch = false;

    // Count the number of horizontal matches
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        try {
          if (array[i][j] == array[i][++j]) {
            // Return k back to its correct value
            --j;

            // We must recognize two matches if k = 0 and the pattern matched
            if (j != 0) {
              x++;
            } else {
              x = 2;
            }

            // If there are four matches, then we have four in a row
            if (x >= 4) {
              existsHorizontalMatch = true;
            }
            System.out.println("x is "+x);
          }
        } catch (ArrayIndexOutOfBoundsException e) {
          // Do nothing as this is expected
        }
        x = 0;
      }
    }

    // Count the number of vertical matches
    for (int i = 0; i < array.length; i++) {
      try {
        for (int j = 0; j < array[i].length; j++) {
          try {
            for (int k = i; k < array.length; k++) {
              if (array[k][j] == array[++k][j]) {
                // Return j back to its original value
                --k;

                // We must recognize two matches if k = 0 and the pattern matched
                if (k != 0) {
                  y++;
                } else {
                  y = 2;
                }

                // If there are four matches, then we have four in a row
                if (y >= 4) {
                  existsVerticaltalMatch = true;
                }
              }
              System.out.print(array[k][j]);
            }
          } catch (ArrayIndexOutOfBoundsException e) {
            // Do nothing as this is expected
          }
        y = 0;
        }
      } catch (ArrayIndexOutOfBoundsException e) {
        // Do nothing as this is expected
      }
    }

    System.out.println(existsHorizontalMatch);
    System.out.println(existsVerticaltalMatch);

    // Return the results
    if ((existsHorizontalMatch) || (existsVerticaltalMatch) || (existsDiagonalMatch)) {
      return true;
    } else {
      return false;
    }
  }

  // Determines the vertical length of the input file
  public static int verticalLengthOfFile(Scanner inputFile) {

    /*
    *  Initialize vLength inside the method so scope doesn't interfere with the
    *  return portion.
    */

    int vLength;

    // Count the number of lines
    for (vLength = 0; inputFile.hasNextLine(); vLength++) {
      inputFile.nextLine();
    }
    return vLength;
  }

  // Determines the horizontal length of the input file
  public static int horizontalLengthOfFile(Scanner inputFile) {

    /*
    *  Initialize hLength inside the method so scope doesn't interfere with the
    *  return portion.
    */

    int hLength;

    // Count the number of elements on each line
    for (hLength = 0; inputFile.hasNextInt(); hLength++) {
      inputFile.nextInt();
    }
    return hLength;
  }
}
