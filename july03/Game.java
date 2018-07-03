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
  }
  public static void main(String[] args) {
    Game a = new Game(34);
    System.out.println( "From " + a.size() + " I take " + 3 );
    a.extract(3); 
    System.out.println( " ... and I am left with " + a.size()); 
    a.extract(4); 
    System.out.println( a.size() );
    a.extract(10); 
    System.out.println( a.size() );
    a.extract(2); 
  }
}