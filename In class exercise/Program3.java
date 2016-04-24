/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: April 24, 2016
*  Last Updated: April 24, 2016
*
*  Description: Print author's name, and using a for loop, produce the following
*  output:
*    index is less than three =0
*    index is less than three =1
*    index is less than three =2
*    index is greater than or equal to three =3
*    index is greater than or equal to three =4
*/

// Import packages

public class Program3 {
  public static void main(String[] args) {
    String author = "Connor Baker";
    System.out.println(author);
    for (int i = 0; i < 5; i++) {
      if (i < 3) {
        System.out.println("index is less than three ="+i);
      } else {
        System.out.println("index is greater than or equal to three ="+i);
      }
    }
  }
}
