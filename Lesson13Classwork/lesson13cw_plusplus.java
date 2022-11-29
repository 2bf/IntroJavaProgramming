/***
Chiming Wang
10/11//2022
Java Period 8
Lesson 13 Classwork

lesson13cw_plusplus.java
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class lesson13cw_plusplus 
{
   
   public static void main (String[] args)
   {
      int x = 7, x1 = 7;
      int y = x++;
      int y1 = ++x1;
      
      System.out.println(x);
      System.out.println(x1);
      System.out.println("x++ = " + y); 
      System.out.println("++x = " + y1); 
      
      System.out.println("Prefix ++ tells you the value first, then assigns the new value to the integer."); 
      System.out.println("Postfix ++ assigns the new value to the integer first, then tells you that new value.");
      //Prefix ++ tells you the value first, then assigns the new value to the integer.
      //Postfix ++ assigns the new value to the integer first, then tells you that new value.
            
   }
}
