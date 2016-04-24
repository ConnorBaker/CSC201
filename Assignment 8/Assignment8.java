/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: April 23, 2016
*  Last Updated: April 23, 2016
*
*  Description: Display three cards randomly selected from a deck of 52. The
*  cards (stored as .png files) are in a directory named image/card. All three
*  cards must be distinct and selected randomly.
*/

// Import javafx packages
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// Import io packages
import java.io.FileReader;
import java.io.FileNotFoundException;

// Import util packages
import java.util.Scanner;
import java.util.Arrays;


public class Assignment8 extends Application {
  // We must override the start method in the Application class
  @Override

  public static void main(String[] args) throws FileNotFoundException {
    // Create an array of strings to hold the filenames of the cards
    int cards[] = new int[51];

    // Iterate through the array to create filenames
    for (int i = 0; i < cards.length; i++) {
      cards[i] = i;
    }

    System.out.println(Arrays.deepToString(cards));

  }
}
