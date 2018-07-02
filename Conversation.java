// reading one value

public class Conversation {
  public static void main(String[] args) {
    System.out.print("Enter value: "); 
    String line = (new java.util.Scanner(System.in)).nextLine(); 
    double number = Double.parseDouble(line); 
    System.out.println("You typed: " + number); 
  }
}