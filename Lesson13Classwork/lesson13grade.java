/***
Chiming Wang
10/11/2022
Java Period 8
Lesson 13 Classwork

lesson13grade.java
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class lesson13grade
{
   
   public static void main (String[] args)
   {
      int i; //integer
      char letGrade;
      
      Scanner scan = new Scanner (System.in); //creates scanner
      
      //scanner for user to imput number
      System.out.println("Enter your grade:"); 
      i = scan.nextInt();
      
      if ((i >= 94) && (i <= 100)) {
         letGrade = 'A';
         System.out.println("Your grade of " + i + " is a letter grade of: ");
         System.out.print(letGrade);
         
      } else if ((i >= 85) && (i < 94)) {
         letGrade = 'B';
         System.out.println("Your grade of " + i + " is a letter grade of: ");
         System.out.print(letGrade);
         
      } else if ((i >= 75) && (i < 85)) {
         letGrade = 'C';
         System.out.println("Your grade of " + i + " is a letter grade of: ");
         System.out.print(letGrade);
         
      } else if ((i >= 65) && (i < 75)) {
         letGrade = 'D';
         System.out.println("Your grade of " + i + " is a letter grade of: ");
         System.out.print(letGrade);
         
      } else if (i < 60) {
         letGrade = 'F';
         System.out.println("Your grade of " + i + " is a letter grade of: ");
         System.out.print(letGrade);
         
      } else if (i > 100) {
         System.out.println("Error: inputted value was over 100");
         
      }
   
   }
}
