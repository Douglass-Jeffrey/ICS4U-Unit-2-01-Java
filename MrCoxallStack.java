/* 
* This class creates an arraylist that will recieve input from  class
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-12-07
*/

// Import the ArrayList class
import java.util.ArrayList;

public class MrCoxallStack {
    
  // Creates arraylist that will act as a stack
  ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

  // Method 
  public void push(int receivedNum) {
    stackAsArray.add(receivedNum);
  }

  // Getter
  public int getNumber() {
    return this.stackAsArray.get(0);
  }
}
