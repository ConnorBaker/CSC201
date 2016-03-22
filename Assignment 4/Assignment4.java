/*
 *  Author: Connor Baker
 *  Version: 0.9a
 *  Created: February 25, 2016
 *  Last Updated: February 27, 2016
 *
 *  Description: Creates three different arrays. The first array
 *  (firstArray) is filled with 99 int values between [0,36],
 *  simulating the spins of a roulette wheel. The second array
 *  (secondArray) is a copy of firstArray, with the color that the spin
 *  of the roulette wheel would have yielded, tacked on as a single
 *  letter String. The third array (thirdArray) is derived from
 *  firstArray and holds the multiplicity of each spin, the index
 *  matching the respective number the spin yeilded (so thirdArray[1]
 *  holds the multiplicity of spins that landed on one).
 *
 *  Description (cont.): The program prints the values of secondArray
 *  and thirdArray in rows of 10.
 *
 *  TODO: Split the program into more methods -- it really could stand
 *  to be cleaner.
 *
 *  TODO: Find a way to erase a need for secondArray -- I'm fairly
 *  certain that I tweak the determineColor method to use firstArray.
 *  IF this isn't possible, then fix the creation of secondArray to
 *  use ArrayCopy (instead of a loop) to populate the array.
 */

// Import necessary packages
import java.util.Random;
import java.util.Arrays;

public class Assignment4 { // start class

  public static void main(String args[]) { // start main method

    // Print Author's name
    System.out.println("\nConnor Baker\n");

    // Create firstArray
    int sizeoffirstArray = 99;
    int firstArray[] = new int[sizeoffirstArray];

    // Fill firstArray with integers 0<=n<37
    Random r = new Random();
    for (int i = 0; i < firstArray.length; i++) {
      firstArray[i] = r.nextInt(37);
    }

    /*
     * Create secondArray as a copy of firstArray modified by the
     * determineColor method.
     */

    String secondArray[] = new String [sizeoffirstArray];
    for (int i = 0; i < firstArray.length; i++) {
      secondArray[i] = firstArray[i] + " " + determineColor(firstArray[i]);
    }

    // Print the contents of secondArray in rows of 10
    System.out.println("Spin and color:");
    int lineBreak = 1;
    for (int i = 0; i < firstArray.length; i++) {
      if (lineBreak < 10) {
        System.out.print(secondArray[i] + ", ");
        lineBreak++;
      } else {
        System.out.println(secondArray[i] + ", ");
        lineBreak = 1;
      }
    }
    lineBreak = 1;
    System.out.println("\n");

    // Create thirdArray with size 37
    int sizeofthirdArray = 37;
    int thirdArray[] = new int[sizeofthirdArray];

    /*
     * Initialize 'k' (key) and 'm' (multiplicity), used as a reference value to
     * search through firstArray, and as counter for the times that that
     * reference value is found in firstArray, respectively. Then proceed to
     * fill thirdArray with the 'm' of each spin.
     */

    int k = 0;
    int m = 0;

    for (int i = 0; i < sizeofthirdArray; i++) {

      // Loop through each element of firstArray looking for the multiplicity of each integer -- which we enumerate with 'm'
      for (int j = 0; j < sizeoffirstArray; j++) {

        // Use the key, 'k', to search for a value [0,36], incremented after each loop
        if (k == firstArray[j])
        m++;
      }

      // Set the 'm' of each value to its corresponding number index
      thirdArray[i] = m;

      // Reset 'm' after each match, increment 'k', and loop again
      m = 0;
      k++;
    }

    // Print the contents of thirdArray in rows of 10
    System.out.println("Multiplicity of spins:");
    lineBreak = 1;
    for (int i = 0; i < thirdArray.length; i++) {
      if (lineBreak < 10) {
        System.out.print(+ i + " came up " + thirdArray[i] + " times. ");
        lineBreak++;
      } else {
        System.out.print(+ i + " came up " + thirdArray[i] + " times. ");
        lineBreak = 1;
      }
    }
    lineBreak = 1;
    System.out.println("\n");

    // Initialize sum
    int sum = 0;

    // Calculate the sum of all elements of firstArray
    for (int i = 0; i < firstArray.length; i++) {
      sum += firstArray[i];
    }

    // Calculate the average of firstArray
    double average = (double) sum / firstArray.length;

    // Calculate the median of thirdArray
    Arrays.parallelSort(firstArray);
    double median = (double)firstArray[firstArray.length/2];

    // Print the average and median of firstArray
    System.out.println("The average is " + average + ".");
    System.out.println("The median is " + median + ".");
  } // end main

  public static String determineColor(int x) { // start determineColor method

    // Initialize an empty string
    String color = "";

    // Check parity and value to determine the color of the given integer
    if (((1 <= x) && (x <= 10)) || ((19 <= x) && (x <= 28))) {
      if ((x % 2) == 0) {
        color = "B";
      } else {
        color = "R";
      }
    }
    if (((11 <= x) && (x <= 18)) || ((29 <= x) && (x <= 36))) {
      if ((x % 2) == 0) {
        color = "R";
      } else {
        color = "B";
      }
    }
    if (x == 0) {
      color = "G";
    }
    return color;
  }
} // end class
