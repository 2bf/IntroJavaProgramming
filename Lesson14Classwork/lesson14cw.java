/***
Chiming Wang
10/132022
Java Period 8
Lesson 14
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class lesson14cw
{
   
   public static void main (String[] args)
   {
      //declares integers
      int tens = 1;
      int ones = 0;
      int e = tens; // int to control loop amount
      
      //main part of program
      while (e < 5) {
         System.out.println(tens + " " + ones);
         ones++;
         e = tens;
         //moves tens up when ones place reaches 10
         while (ones == 10) {
            ones = 0;
            tens++;
         }
      
      }
      

      
      
            
      
   }
}
