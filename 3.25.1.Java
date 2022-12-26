// 3.25.1: LAB 3.2: Leap year

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      int inputYear;
      boolean isLeapYear;
      
      isLeapYear = false;
      inputYear = scnr.nextInt();
      
      // lines 20 - 31 check to determine if inputYear is a leap year
      if (inputYear % 4 == 0) {
         isLeapYear = true;      // all leap years will be divisible by 4
         if (inputYear % 100 == 0) {   // all century years will be divisible by 100
            if (inputYear % 400 == 0) {   
                isLeapYear = true;     
            } else {
                isLeapYear = false;
            }
            // century leap years are divisible by 4, so if line 23 is true, then isLeapYear = true
         }
      } else {
         isLeapYear = false;
      }
      // completes block of code by giving an else statement if the inputYear was not divisible by 4
           
      if (isLeapYear) {
         System.out.println(inputYear + " - leap year");
      } else {
         System.out.println(inputYear + " - not a leap year");
      }
      // prints output statements
   }
}
