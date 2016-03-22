/*
*  Author: Connor Baker
*  Version: 0.9d
*  Created: February 3, 2016
*  Last Updated: February 13, 2016
*
*  Description: Read student data from a text file, compute
*  values (such as a letter grade), and output the result
*  into an HTML file.
*
*  TODO: Consider replacing the try-catch statement with
*  readAllLines from the java.nio package.
*
*  TODO: Change the while loop to:
*  "for (int iteration = 0; ; iteration++)"
*
*  TODO: Make sure to catch NoSuchElementException.
*/

// Import necessary packages
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment3 { // start class

  public static void main(String args[]) throws FileNotFoundException { // start main


    // Check if file students.txt exists
    boolean exists = new File("students.txt").isFile();
    if (exists == true) {

          // Set up Scaner and FileReader to grab input
          Scanner inFile = new Scanner(new FileReader("students.txt"));

          // Set up PrintWriter to write to the HTML file
          PrintWriter printWriter = new PrintWriter("students.HTML");

          // Initialize strings
          String firstName;
          String isAthlete;
          String isEligible;
          String lastName;
          String letterGrade;

          // Initialize integers
          int iterationCount = 1;
          int numericalGrade;
          int quizGrade;
          int test1Grade;
          int test2Grade;
          final int INFINITY = Integer.MAX_VALUE;

          // Format the HTML file
          printWriter.println("<HTML>");
          printWriter.println("<P>My Name is Connor Baker");
          printWriter.println("<TABLE BORDER=2 CELLPADDING=4 CELLSPACING=4>");

          // Create tables and headers
          printWriter.println("<TR>");
          printWriter.print("<TH>#</TH>");
          printWriter.print("<TH>Name</TH>");
          printWriter.print("<TH>Athlete?</TH>");
          printWriter.print("<TH>Eligible?</TH>");
          printWriter.print("<TH>Quiz Grade</TH>");
          printWriter.print("<TH>Test 1</TH>");
          printWriter.print("<TH>Test 2</TH>");
          printWriter.print("<TH>Numerical Grade</TH>");
          printWriter.print("<TH>Letter Grade</TH>");
          printWriter.print("</TR>");

          // Loop processing to evaluate multiple students
          try {

            // Use a while statement with 'number < infinity' as we are unsure of document length
            while (iterationCount < INFINITY) {

              // Grab values from the input file
              lastName = inFile.next();
              firstName = inFile.next();
              isAthlete = inFile.next();
              quizGrade = inFile.nextInt();
              test1Grade = inFile.nextInt();
              test2Grade = inFile.nextInt();

              // Compute the numerical grade of the student
              numericalGrade = (quizGrade + test1Grade + test2Grade) / 3;

              // Determine the letter grade for the student
              if (numericalGrade < 60) {
                letterGrade = "F";
              } else if (numericalGrade < 70) {
                letterGrade = "D";
              } else if (numericalGrade < 80) {
                letterGrade = "C";
              } else if (numericalGrade < 90) {
                letterGrade = "B";
              } else {
                letterGrade = "A";
              }

              // Compute student's eligibilty for competing in "The Big Game"
              if ((numericalGrade >= 70) && (isAthlete.equals("Y"))) {
                isEligible = "Yes";
              } else if (isAthlete.equals("N")) {
                isEligible = "N/A";
              } else {
                isEligible = "No";
              }

              // Print output to HTML file
              printWriter.println("<TR>");
              printWriter.print("<TD>" +iterationCount+ "</TD>");
              printWriter.print("<TD>" +lastName+ ", " +firstName+ "</TD>");
              printWriter.print("<TD>" +isAthlete+ "</TD>");
              printWriter.print("<TD>" +isEligible+ "</TD>");
              printWriter.print("<TD>" +quizGrade+ "</TD>");
              printWriter.print("<TD>" +test1Grade+ "</TD>");
              printWriter.print("<TD>" +test2Grade+ "</TD>");
              printWriter.print("<TD>" +numericalGrade+ "</TD>");
              printWriter.print("<TD>" +letterGrade+ "</TD>");
              printWriter.print("</TR>");

              // Update iterationCount
              iterationCount++;
            }

          } catch (Exception IOException) {
            System.out.println("\nPlease check the output file \"students.HTML\"");
          }

          // Close PrintWriter
          printWriter.close();

          // Close input file
          inFile.close();
    } else {

    // The data set does not exist. Warn the user.
    System.out.println("\nFile \"students.txt\" is not in the current directory.");
    System.out.println("Please put \"students.txt\" in this directory and try again.");
    }
  } // end main
} // end class
