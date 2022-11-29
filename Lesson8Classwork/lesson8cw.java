/*
Chiming Wang
9/12/2022
Java Period 8
Lesson 8 Classwork
*/


public class lesson8cw 
{
   
   public static void main (String[] args)
   {
      
      //declares variables
      double x, y, z; 
      x = 12.7;
      y = 7.2;
      z = x-y;
      int a = 3;
      int b = 2;
      int c = a*b;
      
      //prints c. then redefines c as the quotient of a and b, then redefines c as their remainder
      System.out.println(c);
      c = a/b;
      System.out.println(c);
      c = a%c;
      System.out.println(c);
      
      // creates a double f that is the quotient of double x and int a
      double f = x/a;
      System.out.println(f);
     
   }
}
