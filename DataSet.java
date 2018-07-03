// added a static method 

public class DataSet {
  private int count; 
  private double sum; 
  public void add(double value) {
    this.sum += value; 
    this.count += 1; 
  }
  public boolean hasData() {
    return this.count != 0;  
  }
  public double getAverage() {
    return this.sum / this.count;     
  }
  public static void printAverage(DataSet a) {
    if (! a.hasData()) System.out.println( a + " has no data." ); 
    else System.out.println( a + "reports average as: " + a.getAverage()); 
  }
  public static void main(String[] args) {
    DataSet a = new DataSet(); 
    a.add(2.3); 
    a.add(1.01);
    a.add(-1.6); 
    printAverage(a); 
    DataSet b = new DataSet(); 
    printAverage(b); 
  }
}
