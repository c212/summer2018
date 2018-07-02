public class DataSet {
  public void add(double value) {
    System.out.println("Oh, you want to add " + value + " to " + this); 
  }
  public static void main(String[] args) {
    DataSet a = new DataSet(); 
    System.out.println( a ); 
    a.add(2.3); 
    DataSet b = new DataSet(); 
    b.add(2);
    b.add(3); 
    a.add(-1.15); 
  }
}