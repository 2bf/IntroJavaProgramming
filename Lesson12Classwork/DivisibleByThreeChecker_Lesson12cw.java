/***
Chiming Wang
9/22/2022
Java Period 8
Lesson 12 Classwork
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class DivisibleByThreeChecker_Lesson12cw
{
   
   public static void main (String[] args)
   {
      int a; //integer
      
      Scanner scan = new Scanner (System.in); //creates scanner
      Random randomNum = new Random(); //creates random 
      
      //scanner for user to imput number
      System.out.println("Enter a random integer, I will check if it is divisible by 3:"); 
      a = scan.nextInt();
      
      //checks if number is divisible by 3, sends output
      int b = a%3;
      if (b == 0) {
         System.out.println("Your number is divisible by 3");
      } else {
         System.out.println("Your number is not divisible by 3");
      }
      
   }
}
