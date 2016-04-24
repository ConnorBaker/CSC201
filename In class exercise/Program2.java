/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: April 24, 2016
*  Last Updated: April 24, 2016
*
*  Description: Print author's name, and using a for loop, produce the following
*  output:
*    Hi, index is 0
*    Hi, index is 1
*    Hi, index is 2
*    Hi, index is 3
*/

// Import packages

public class Program2 {
  public static void main(String[] args) {
    String author = "Connor Baker";
    System.out.println(author);
    for (int i = 0; i < 4; i++) {
      System.out.println("Hi, index is "+i);
    }
  }
}
