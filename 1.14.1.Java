// 1.14.1: LAB: Divide input integers

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int userNum = scnr.nextInt();
      int divNum = scnr.nextInt();
      
      System.out.print(userNum / (divNum) + " ");
      System.out.print(userNum / (divNum * divNum) + " ");
      System.out.println(userNum / (divNum * divNum * divNum));
      
   scnr.close();
   }
}
