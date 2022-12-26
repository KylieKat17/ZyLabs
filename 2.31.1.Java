// 2.31.1: LAB: Simple statistics

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      int num3 = scnr.nextInt();
      int num4 = scnr.nextInt();
      /* the above scan the input and declare individual integers */
      
      int product = num1 * num2 * num3 * num4; // multiplies the integers together to get the product
      int average = (num1 + num2 + num3 + num4) / 4; // adds the integers to get the sum and then divides by four to get the average
      
      double decimalProduct = ((double)num1 * (double)num2 * (double)num3 * (double)num4);
      double decimalAverage = (double)((double)(num1 + num2 + num3 + num4) / 4);
      // functions the same as lines 18 and 19, but allows for decimals
      
      System.out.println(product + " " + average); // prints the first output line
      
      System.out.printf("%.3f", decimalProduct);
      System.out.print(" ");
      System.out.printf("%.3f\n", decimalAverage);
      // prints the second output line
      
      scnr.close();
   
   }
}
