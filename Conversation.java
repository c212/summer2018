// modified so all data comes from the command line 

import java.util.Scanner; 

/*

Welcome to DrJava.  Working directory is C:\Users\dgerman\Desktop\0702-a
> run Conversation
No data. 
> run Conversation 3 2 4 1 1 1
Average: 2.0 
> run Conversation 3 2 4 1 1 1 2
Average: 2.0 
> run Conversation 3 2 4 1 1 1 2 3
Average: 2.125 
> 



 */

public class Conversation {
  public static void main(String[] args) {
    double[] numbers = new double[args.length];
    for (int i = 0; i < numbers.length; i++) 
      numbers[i] = Double.parseDouble(args[i]); 
    // System.out.println( java.util.Arrays.toString( numbers ) ); 
    int count = args.length; 
    double sum = 0; 
    for (double value : numbers)
      sum = sum + value; 
    if (count == 0) System.out.println("No data."); 
    else System.out.println("Average: " + (sum / count));
  }
}