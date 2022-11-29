/***
Chiming Wang
9/20/2022
Java Period 8
Lesson 11 Classwork

lesson11cw.java
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class lesson11cw 
{
   
   public static void main (String[] args)
   {
      int a; //integer
      
      Scanner scan = new Scanner (System.in); //creates scanner
      Random randomNum = new Random(); //creates random 
      
      //scanner for user to imput number
      System.out.println("Enter a random integer:"); 
      a = scan.nextInt();
      
      //square roots user's number
      System.out.println ("The square root of your integer is: " + Math.sqrt(a));
      
      //prints out absolute value of user's number
      System.out.println ("The absolute value of your integer is: " + Math.abs(a));
      
      //prints out a random number from 0 to the user's number
      int num1;
      num1 = randomNum.nextInt(a);
      System.out.println ("Random number from 0 to your number: " + num1);
      
      String str1;
      Scanner scan2 = new Scanner (System.in); //creates scanner for the string
      
      //scanner for user to imput string
      System.out.println("Enter a random string:"); 
      str1 = scan2.nextLine();
      
      int length = str1.length(); //using length method and dot operator to find length of string
      System.out.println(str1); //prints out string
      System.out.println ("The length of your string is: " + length); //print out string length
      
      //prints out last 6 letters of string
      System.out.println("The last 6 characters of your string are: "); 
      for(int i = 0; i < 6; i++){
      
         System.out.print(str1.charAt(length - 6 + i));
      
      }
      
   }
}
