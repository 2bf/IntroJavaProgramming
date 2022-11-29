/***
Chiming Wang
10/18/2022
Java Period 8
Lesson 15
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class lesson15cw_dowhile
{
   
   public static void main (String[] args)
   {
      //declares integers
      int i = 45;
      double x = i%9;
      
            
      //main part of program
      do {
         
         x = i%9;
         
         if (x == 0) {
         System.out.println(i + ", ");
         }
         
         i--;

      }
      while (i >= -45); 
      
      
      

      
      
            
      
   }
}
