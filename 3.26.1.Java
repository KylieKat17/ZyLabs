// 3.26.1: LAB 3.3: Interstate highway numbers

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber; //not used in this code but I'm leaving it because it does not interfere and was given

      highwayNumber = scnr.nextInt();
      
      // the block below determines if a highway/interstate number is primary, as well as the direction it is going
      if ((0 < highwayNumber) && (highwayNumber < 100)) {
        if (highwayNumber % 2 == 0) {
            System.out.println("I-" + highwayNumber + " is primary, going east/west.");
        } else {
            System.out.println("I-" + highwayNumber + " is primary, going north/south.");
        }
      }
      
      // the block below determines if a highway/interstate is auxiliary, what primary highway/interstate it serves, and the direction it travels
      else if ((100 <= highwayNumber) && (highwayNumber < 1000)) {
        int auxiliaryNumber = highwayNumber % 100; // declares auxilaryNumber as an int and shows its function
         if (auxiliaryNumber == 0) {
            System.out.println(highwayNumber + " is not a valid interstate highway number."); 
            // lines 28-30 check to determine that the last 2 digits in a variable are not '00' which would make it invalid and therefore fit the print statement
           } else {
         if (auxiliaryNumber % 2 == 0) {
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + auxiliaryNumber + ", going east/west.");
         } else {
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + auxiliaryNumber + ", going north/south.");
        }
      }
      }
      else {
        System.out.println(highwayNumber + " is not a valid interstate highway number."); 
        // inputs that did not pass the first two blocks, automatically get printed as invalid interstate highway numbers
      }
   }
}
