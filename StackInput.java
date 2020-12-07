/*
* This program pushes a user input to a program with a class containing an 
* arraylist. The most recent input of the arraylist is then pushed back from
* that class into this program and is outputted, mimicking how the stack works
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-12-07
*/

// Import the Scanner class
import java.util.Scanner;

public class StackInput {
  /**
  * This program recieves input and adds values onto our pseudo-stack.
  */
  public static void main(String[] args) {

    // create scanner object
    Scanner userInput = new Scanner(System.in);

    // ensures that user inputs only integer values
    try {
      // receive user input
      System.out.println("Enter an integer to push onto the stack ");
      int numberChosen = userInput.nextInt();
      System.out.println();

      // references MrCoxallStack file 
      MrCoxallStack clasStack = new MrCoxallStack();

      // Pushes user input into arraylist in MrCoxallStack 
      clasStack.push(numberChosen);

      // Retrieves value from arraylist in MrCoxallStack
      System.out.println("Pushed: " + clasStack.getNumber());

    } catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}