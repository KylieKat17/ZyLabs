// 2.28.1: LAB: Expression for calories burned during workout

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double ageYears = scnr.nextDouble(); // age of a person in years
      double weightLbs = scnr.nextDouble(); // weight of a person in pounds (lbs)
      double heartrateBPM = scnr.nextDouble(); // heart rate in beats per minute (BPM)
      double timeMinutes = scnr.nextDouble(); // time in minutes
      
      double avgCalories = (((ageYears * 0.2757) + (weightLbs * 0.03295) + (heartrateBPM * 1.0781)) - 75.4991) * (timeMinutes / 8.368); 
      /* finds the sum of the already multiplied ageYears, weightLbs, heartrateBPM as displayed by the inner parenthesis of the original equation
      * then finds the remainder of the secondary parenthesis after subtracting 75.4991
      * thenfinds the full equation of the secondary parenthesis multiplied by time divided by 8.368 as defined in the original equation
      */
      
      System.out.print("Calories: ");
      System.out.printf("%.2f", avgCalories);
      System.out.println(" calories");
      
      /* the above statements print the final output statement */
      
      scnr.close();
   }
} 
