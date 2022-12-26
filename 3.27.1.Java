// 3.27.1: LAB 3.4: Name format

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in); // creating a scanner to read the input
      
      // declare variables
      String firstName;
      String middleName;
      String lastName;
      String name;
      
      name = scnr.nextLine(); // scanner initialized to read input
      
      int firstSpace = name.indexOf(" ");
         firstName = name.substring(0, firstSpace);
         
      int secondSpace = name.indexOf(" ", firstSpace + 1);
      
      // if-else print statements 
      if (secondSpace < 0) {
         lastName = name.substring(firstSpace + 1);
         System.out.println(lastName + ", " + firstName.charAt(0) + ".");
      } else {
         middleName = name.substring(firstSpace, secondSpace);
         lastName = name.substring(secondSpace + 1);
         System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(1) + ".");
         // .charAt(#) tells the printer to print the specific character within the written variables
      }
      
   }
}
