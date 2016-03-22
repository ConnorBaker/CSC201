/*
*  Author: Connor Baker
*  Version: 0.3a
*  Created: March 18, 2016
*  Last Updated: March 18, 2016
*
*  Description: To be used for performing statistical analysis on a
*  series of arrays.
*
*  TODO: Comments.
*
*  TODO: Add mean and median analysis functionality.
*
*  TODO: Add the ability to read from files.
*
*  TODO: Fix the horrible try-catch workaround in fillArray.
*/

// Import necessary packages
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayStuff {
  public static void main(String[] args) {
    int[][][] arrayFirst = createArray();
    printArray(arrayFirst);
    fillArray(arrayFirst);
    printArray(arrayFirst);
    int[][][] arraySecond = createArray();
    printArray(arraySecond);
    fillArray(arraySecond);
    printArray(arraySecond);
  }

  /*
  *  At some point, createArray should provide the capability
  *  of reading data from a file and setting array size
  *  based on that.
  */

  public static int[][][] createArray() {
    int[][][] arrayTemp = new int[5][4][3];
    return arrayTemp;
  }

  /*
  *  At some point, the ceiling for randomFill should
  *  be determined based on the bit-depth of the photo.
  */

  public static int randomFill() {
    Random random = new Random();
    int randomNumber = random.nextInt(255);
    return randomNumber;
  }

  /*
  *  At some point, fillArray should provide the capability
  *  of reading data from a file and setting array values
  *  based on that.
  */

  public static int[][][] fillArray(int[][][] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
      for (int j = 0; j < inputArray[i].length; j++) {
        try {
          for (int k = 0; k < inputArray[j].length; k++) {
            inputArray[i][j][k] = randomFill();
          }
        } catch (ArrayIndexOutOfBoundsException e) {
          // Do nothing because I'm a piece of shit and so is this workaround
        }
      }
    }
    return inputArray;
  }

  public static int[][][] meanArray(int[][][] inputArray1, int[][][] inputArray2) {
    
  }

  // public static int[][][] medianArray(int[][][] inputArray) {
  //
  // }

  public static void printArray(int[][][] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
      System.out.print("[");
      for (int j = 0; j < inputArray[i].length; j++) {
        System.out.print("{");
        try {
          for (int k = 0; k < inputArray[j].length; k++) {
            if (k < (inputArray[j].length - 1)) {
              System.out.print(" " + inputArray[i][j][k] + " ");
            } else {
              System.out.print(inputArray[i][j][k]);
            }
          }
        } catch (ArrayIndexOutOfBoundsException e) {
          // Do nothing because I'm a piece of shit and so is this workaround
        }
        if (j < (inputArray[i].length - 1)) {
          System.out.print("}, ");
        } else {
          System.out.print("}");
        }
      }
      System.out.print("]\n");
    }
  }
}
