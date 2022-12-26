// 2.30.1: LAB: Using math methods

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double x = scnr.nextDouble(); // will scan for the first input intiger
      double y = scnr.nextDouble(); // will scan for the second input intiger
      double z = scnr.nextDouble(); // will scan for the third input intiger
      
      double g = Math.sqrt(x * y); /* declared a new variable that computes 
      the square root of "x" multiplied by "y" to be used in eqn4 for simplicity */
      
      double eqn1 = Math.pow((x), (z)); // the first equation finds "x" to the power of "z"
      double eqn2 = Math.pow((x), Math.pow((y), (z))); 
      /* the second equation finds x^(y^z) which is "x" to the power of "y" to the power of "z" */
      double eqn3 = Math.abs(y); // the third equation finds the absolute power of "y"
      double eqn4 = Math.pow((g), z); // the fourth equation finds the newly declared "g" to the power of "z"
      
      System.out.println(eqn1 + " " + eqn2 + " " + eqn3 + " " + eqn4); // prints the full final statement and creates a new line
      
   }
}
