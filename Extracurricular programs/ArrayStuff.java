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
    int[][][] master_array = create3dArray();

    // Fill master_array
    for (int i = 0; i < master_array.length; i++) {
      master_array[i] = fillArray();
      // for (int j = 0; j < master_array[i].length; j++) {
      //   master_array[i][j] = randomFill();
      //   for (int k = 0; k < master_array[j].length; k++) {
      //     master_array[i][j][k] = randomFill();
      //   }
      // }
    }

    print3dArray(master_array);
  }

  /*
  *  At some point, createArray should provide the capability
  *  of reading data from a file and setting array size
  *  based on that.
  */

  public static int[][] create2dArray() {
    int[][] arrayTemp = new int[randomFill()][randomFill()];
    return arrayTemp;
  }

  public static int[][][] create3dArray() {
    int[][][] arrayTemp = new int[randomFill()][randomFill()][randomFill()];
    return arrayTemp;
  }

  /*
  *  At some point, the ceiling for randomFill should
  *  be determined based on the bit-depth of the photo.
  */

  public static int randomFill() {
    Random random = new Random();
    int randomNumber = random.nextInt(3);
    return randomNumber;
  }

  /*
  *  At some point, fillArray should provide the capability
  *  of reading data from a file and setting array values
  *  based on that.
  */

  public static int[][] fillArray(int[][] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
      for (int j = 0; j < inputArray[i].length; j++) {
          inputArray[i][j] = randomFill();
      }
    }
    return inputArray;
  }

  // public static int[][][] meanArray(int[][][] inputArray1, int[][][] inputArray2) {
  //
  // }

  // public static int[][][] medianArray(int[][][] inputArray) {
  //
  // }

  public static void print2dArray(int[][] inputArray) {
    System.out.println(Arrays.deepToString(inputArray));
  }

  public static void print3dArray(int[][][] inputArray) {
    System.out.println(Arrays.deepToString(inputArray));
  }
}
