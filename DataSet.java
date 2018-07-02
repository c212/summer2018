// notice the extra function 

public class DataSet {
  private int count; 
  private double sum; 
  public void add(double value) {
    // System.out.println("Oh, you want to add " + value + " to " + this); 
    this.sum += value; 
    this.count += 1; 
    // System.out.println("Current average in " + this + " is: " + ( this.sum / this.count )); 
  }
  public boolean hasData() {
    return this.count != 0;  
  }
  public double getAverage() {
    return this.sum / this.count;     
  }
  public static void main(String[] args) {
    DataSet a = new DataSet(); 
    // System.out.println( a ); 
    a.add(2.3); 
    a.add(1.01);
    a.add(-1.6); 
    if (a.hasData()) {
      System.out.println( "Average for " + a + " is: " + a.getAverage() );  
    } else {
      System.out.println( a + " has no data inside.");  
    }
    DataSet b = new DataSet(); 
    if (b.hasData()) {
      System.out.println( "Average for " + b + " is: " + b.getAverage() );  
    } else {
      System.out.println( b + " has no data inside.");  
    }
  }
}