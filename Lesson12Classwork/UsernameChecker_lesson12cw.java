/***
Chiming Wang
9/22/2022
Java Period 8
Lesson 12 Classwork

UsernameChecker_lesson12cw.java
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class UsernameChecker_lesson12cw
{
   
   public static void main (String[] args)
   {
   
      String str1;
      Scanner scan = new Scanner (System.in); //creates scanner
      
      
      //scanner for user to imput string
      System.out.println("Enter your username:"); 
      str1 = scan.nextLine();
      
      char g = str1.charAt(0);
      int length = str1.length(); //using length method and dot operator to find length of string
      
      
      //checks if username is at least 7 characters in length and starts with U
      if (length > 6) {
         if (g == 'U') {
         System.out.println("Thank you for inputting your username.");
         }
         else {
         System.out.println("Sorry, your userame must start with the letter U.");
         }
      } else {
      System.out.println("Sorry, your username must be longer than 6 characters in length.");
      }
      
      
      
   }
}
