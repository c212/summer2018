// updated and reporting cumulative stats 

import java.util.Scanner; 

public class Conversation {
  public static void main(String[] args) {
    int count = 0; // how many numbers entered thus far
    double sum = 0; // local variable must be initialized by programmer 
    System.out.print("Enter value: "); 
    Scanner input = new Scanner(System.in); 
    String line = input.nextLine(); 
    while (! line.equalsIgnoreCase("bye")) { 
      double number = Double.parseDouble(line); 
      sum = sum + number; 
      count++;
      System.out.println("You typed: " + number); 
      System.out.println("Average so far: " + ( sum / count )); 
      System.out.print("Enter value: "); 
      line = input.nextLine(); 
    }
    if (count == 0) 
      System.out.println("No data."); 
    else 
      System.out.println("See you later."); 
  }
}