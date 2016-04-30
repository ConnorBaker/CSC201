/*
*  Author: Connor Baker
*  Version: 0.3a
*  Created: April 23, 2016
*  Last Updated: April 29, 2016
*
*  Description: Display three cards randomly selected from a deck of 52. The
*  cards (stored as .png files) are in a directory named image/card. All three
*  cards must be distinct and selected randomly.
*/

// Import javafx packages
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Import util packages
import java.util.Arrays;
import java.util.Random;

public class Assignment8 extends Application {

  public void start(Stage primaryStage) {
    // Print the author's name
    System.out.println("Connor Baker");

    // Generate an array of three distinct numbers
    Random randomNumber = new Random();
    int[] arrayOfRandomNumbers = new int[3];
    for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
      arrayOfRandomNumbers[i] = randomNumber.nextInt(52)+1;
      if (i != 0) {
        if (arrayOfRandomNumbers[i] == arrayOfRandomNumbers[i-1]) {
          arrayOfRandomNumbers[i] = randomNumber.nextInt(52)+1;
          i = i - 1;
        }
      }
    }

    // Create a pane to hold the image views
    Pane pane = new HBox(100);
    pane.setPadding(new Insets(50, 50, 50, 50));

    // Pick the three cards to display
    Image card1 = new Image("image/card/"+arrayOfRandomNumbers[0]+".png");
    Image card2 = new Image("image/card/"+arrayOfRandomNumbers[1]+".png");
    Image card3 = new Image("image/card/"+arrayOfRandomNumbers[2]+".png");

    // Display the three cards
    pane.getChildren().add(new ImageView(card1));
    pane.getChildren().add(new ImageView(card2));
    pane.getChildren().add(new ImageView(card3));

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Display Three Cards - Connor Baker");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
