// modified so all data comes from the command 

import java.util.Scanner; 

public class Conversation {
  public static void main(String[] args) {
    double[] numbers = new double[args.length];
    for (int i = 0; i < numbers.length; i++) 
      System.out.println(args[i] + " will replace numbers[" + i + "] which is currently " + numbers[i] ); 
      
  }
}