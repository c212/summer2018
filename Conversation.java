// reading a value that might not be a number

import java.util.Scanner; 

public class Conversation {
  public static void main(String[] args) {
    System.out.print("Enter value: "); 
    Scanner input = new Scanner(System.in); 
    String line = input.nextLine(); 
    if (line.equalsIgnoreCase("bye")) { 
      System.out.println("OK, see you later..."); 
    } else {
      double number = Double.parseDouble(line); 
      System.out.println("You typed: " + number); 
    }
  }
}