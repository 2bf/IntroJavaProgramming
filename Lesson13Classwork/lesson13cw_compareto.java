/***
Chiming Wang
10/11/2022
Java Period 8
Lesson 13 Classwork

lesson13cw_compareto.java
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class lesson13cw_compareto 
{
   
   public static void main (String[] args)
   {
      String greeting1 = "Hi";
      String greeting1a = "Hi";
      String greeting2 = "Hello";
      String greeting3 = "Hellothere";
      
      System.out.println(greeting1.compareTo(greeting1a)); // Returns 0 because they are equal
      System.out.println(greeting2.compareTo(greeting1)); //returns -4 because greeting1 has less characters than greeting2
      System.out.println(greeting1a.compareTo(greeting3)); //returns 4 because greeting3 has more characters than greeting1a
      
      //If the return value of compareTo is greater than 0, the second string has more characters than the first string
      //If the return value of compareTo is less than 0, the second string has less characters than the first string
            
   }
}
