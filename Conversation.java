// modified so all data comes from the command line 

import java.util.Scanner; 

public class Conversation {
  public static void main(String[] args) {
    double[] numbers = new double[args.length];
    for (int i = 0; i < numbers.length; i++) 
      numbers[i] = Double.parseDouble(args[i]); 
    System.out.println( java.util.Arrays.toString( numbers ) ); 
    
  }
}