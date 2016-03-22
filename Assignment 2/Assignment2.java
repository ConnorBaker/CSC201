/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: March 3, 2016
*  Last Updated: March 22, 2016
*
*  Description:  Print the author's name (Connor Baker), and ask the user to
*  input "a series of three numbers" so that the program can computer the
*  parity of the first number, the smallest number entered, and the
*  average of the three numbers entered.
*/

import java.util.Scanner;

public class Assignment2 { // start class

  public static void main(String args[]) { // start main
    System.out.println("Connor Baker says:");
    System.out.println("\"Please enter a series of three numbers.\"");
    int input = 0;
    int first_input = 0;
    double sum = 0;
    double average = 0.0;
    double min = Double.POSITIVE_INFINITY;
    double max = Double.NEGATIVE_INFINITY;
    int series_length = 0;
    Scanner grabber = new Scanner(System.in);
    int i = 0;
    int j = 0;
    while (i != 3) { // start while
      System.out.println("Enter a number");
      input = grabber.nextInt();
      while (j == 0) {
        first_input = input;
        j++;
      }
      if (min > input) { // start if
        min = input;
      } // end if
      sum = input + sum;
      series_length++;
      i++;
    } // end while
    average = sum / series_length;
    int parity = first_input % 2;
    if (parity == 0) { // start if
      System.out.println("The first number was even");
    } else if (parity != 0) {
      System.out.println("The first number was odd");
    } // end if
    System.out.println("The smallest number was: "+min);
    System.out.println("The average was: "+average);
  } // end main
} // end class
