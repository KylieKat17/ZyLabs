// 3.24.1: LAB 3.1: Smallest number

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in); // a scanner is needed to read the input
      
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      int num3 = input.nextInt();
      // the above will declare and read the input integers
      
      int small = num3; // this is just assuming that the last is the smallest
      
      if ((num1 < num2) && (num2 < num3)) {
         small = num1;
      }
      // checks to decide if num1 is the smallest variable
      
      else if ((num2 < num1) && (num2 < num3)) {
         small = num2;
      }
      // if neither num1 and num2 are the smallest variable, then num3 must be
      
      System.out.println(small); //prints the output, which is the smallest number
   }
}
