/*
*  Author: Connor Baker
*  Version: 0.2a
*  Created: April 23, 2016
*  Last Updated: April 27, 2016
*
*  Description: Create an array that holds the number of cards in a deck (52).
*  Provides a method that shuffles the deck.
*/

// Import util packages
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Cards {

  public static void main(String[] args) {
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
