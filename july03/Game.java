public class Game {
  private int count; 
  public Game(int initial) {
    this.count = initial; 
  }
  public int size() {
    return this.count;  
  }
  public static void main(String[] args) {
    Game a = new Game(34);
    System.out.println( a.size() );
  }
}