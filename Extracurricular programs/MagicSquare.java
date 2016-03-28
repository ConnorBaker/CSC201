/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: March 27, 2016
*  Last Updated: March 27, 2016
*
*  Description: Compute integer values a, b, and c for a third order magic
*  square.
*
*  Description (cont.): In creating a third order magic square, we use:
*   _________________________________________
*  |    c − b    | c + (a + b) |    c − a    |
*  |-------------|-------------|-------------|
*  | c − (a − b) |	    c	     | c + (a − b) |
*  |-------------|-------------|-------------|
*  |    c + a    | c − (a + b) |    c + b    |
*   ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
*  Where 0 < a < b < c − a and b ≠ 2a.
*  https://en.wikipedia.org/wiki/Magic_square
*
*  TODO: Make the logic actually work.
*/

public class MagicSquare {

  public static void main(String[] args) {
    int a = 1;
    int b = 1;
    int c = 1;
    for (int i = 0; i < 5; i++) {
      a++;
      for (int j = 0; j < 5; j++) {
        b++;
        for (int k = 0; k < 10; k++) {
          c++;
          if (b > a) {
            if (b != (2 * a)) {
              if ((c - a) > b) {
                System.out.println("| "+(c-b)+" | "+(c+(a+b))+" | "+(c-a)+" |");
                System.out.println("| "+(c-(a-b))+" | "+c+" | "+(c+(a-b))+" |");
                System.out.println("| "+(c+b)+" | "+(c-(a+b))+" | "+(c+b)+" |\n");
              }
            }
          }
        }
        c = 1;
      }
      b = 1;
    }
    a = 1;
  }
}
