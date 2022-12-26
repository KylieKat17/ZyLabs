// 3.29.1: LAB 3.5.2: Exact change

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in); // create scanner
      
      int cents = scnr.nextInt(); // impliment scanner to read input and declare cents to be input var
      
      // declare variables as ints and use modulos to get decimals for the respective amout per coin
      // and align = so that it is more systematic and easier to read
      int numDollars  = ((cents / 100) % 100);
      int numQuarters = ((cents % 100) / 25);
      int numDimes    = ((cents % 25) / 10);
      int numNickels  = (((cents % 25) % 10) / 5);
      int numPennies  = (((cents % 25) % 10) % 5);
      
      // no change if and print statements
      if (cents == 0) {
         System.out.println("No change");
      }
      
      // dollars if-else and print statements
      if (numDollars < 2 && numDollars == 1) {
         System.out.println(numDollars + " Dollar");
      } else if (2 <= numDollars) {
         System.out.println(numDollars + " Dollars"); 
         // else if statement is present to determine if the description should be singular or plural
      }
      
      // quarters if-else and print statements
      if (numQuarters < 2 && numQuarters == 1) {
         System.out.println(numQuarters + " Quarter"); 
      } else if (2 <= numQuarters) {
         System.out.println(numQuarters + " Quarters"); 
         // else if statement is present to determine if the description should be singular or plural
      }
      
      // dimes if-else and print statements
      if (numDimes < 2 && numDimes == 1) {
         System.out.println(numDimes + " Dime"); 
      } else if (2 <= numDimes) {
         System.out.println(numDimes + " Dimes"); 
         // else if statement is present to determine if the description should be singular or plural
      }
      
      // nickels if-else and print statements
      if (numNickels < 2 && numNickels == 1) {
         System.out.println(numNickels + " Nickel"); 
      } else if (2 <= numNickels) {
         System.out.println(numNickels + " Nickels"); 
         // else if statement is present to determine if the description should be singular or plural
      }
      
      // pennies if-else and print statements
      if (numPennies < 2 && numPennies == 1) {
         System.out.println(numPennies + " Penny"); 
      } else if (2 <= numPennies) {
         System.out.println(numPennies + " Pennies"); 
         // else if statement is present to determine if the description should be singular or plural
      }
   }
}
