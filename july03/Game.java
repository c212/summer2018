import java.util.Scanner; 

public class Game {
  private int count; 
  public Game(int initial) {
    this.count = initial; 
  }
  public int size() {
    return this.count;  
  }
  public void extract(int number) {
    this.count -= number;  
    System.out.println("The pile now: " + this.size()); 
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    Game a = new Game((int)(Math.random() * 50 + 50)); 
    System.out.println("Game starts with " + a.size() + " marbles."); 
    do { 
      System.out.print("You move first: "); 
      int human = Integer.parseInt(in.nextLine()); 
      a.extract(human); 
      if (a.size() < 0) {
        System.out.println("You lost.");  
        break; 
      }
      int computer = 1; 
      System.out.println("Computer takes " + computer + " marbles."); 
      a.extract(computer); 
      if (a.size() < 0) {
        System.out.println("Computer lost.");  
        break; 
      }
    } while (true); 
    
  }
}