/*
*  Author: Connor Baker
*  Version: 0.2a
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
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

// Import util packages
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment8 extends Application {
  // We must override the start method in the Application class
  @Override

  public void start(Stage primaryStage) {
    // Create a pane to hold the image views
    Pane pane = new HBox(10);
    pane.setPadding(new Insets(5, 5, 5, 5));
    Image card1 = new Image("image/card/"+processed[0]+".png");
    Image card2 = new Image("image/card/"+processed[1]+".png");
    Image card3 = new Image("image/card/"+processed[2]+".png");
    pane.getChildren().add(new ImageView(card1));
    pane.getChildren().add(new ImageView(card2));
    pane.getChildren().add(new ImageView(card3));

    ImageView imageView2 = new ImageView(card2);
    imageView2.setFitHeight(100);
    imageView2.setFitWidth(100);
    pane.getChildren().add(imageView2);

    ImageView imageView3 = new ImageView(card3);
    imageView3.setRotate(90);
    pane.getChildren().add(imageView3);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowImage"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public static int[] CreateDeck(int[] deckofcards) {
    // Create an array of ints to hold the numbers of the cards
    int[] deckofcards = {1, 2, 3, 4, 5, 6, 7, 8, 9,
                        10, 11, 12, 13, 14, 15, 16,
                        17, 18, 19, 20, 21, 22, 23,
                        24, 25, 26, 27, 28, 29, 30,
                        31, 32, 33, 34, 35, 36, 37,
                        38, 39, 40, 41, 42, 43, 44,
                        45, 46, 47, 48, 49, 50, 51,
                        52};

    System.out.println(Arrays.toString(deckofcards));
    int[] processed = ShuffleDeck(deckofcards);
    System.out.println(Arrays.toString(processed));
  }

  public static int[] ShuffleDeck(int[] temporaryDeck) {
    Random randomNumber = new Random();
    int index = 0;
    int temporaryNumber = 0;
    int thatHawtness = 0;
    for (int i = 0; i < temporaryDeck.length; i++) {
      index = randomNumber.nextInt(52);
      temporaryNumber = temporaryDeck[i];
      temporaryDeck[i] = temporaryDeck[index];
      temporaryDeck[index] = temporaryNumber;
    }
    return temporaryDeck;
  }
}
