/*
Chiming Wang
9/14/2022
Java Period 8
Lesson 9 Classwork

lesson9cw.java
*/



public class lesson9cw 
{
   
   public static void main (String[] args)
   {
      
      //declares variables
      int radius = 11;
      double pi = 3.14159;
      
      double area = 2 * pi * radius * radius;
      
      // prints area of circle
      System.out.println((area));
      
      //prints area of circle with one decimal
      System.out.printf("%10.1f", area);
      
      //moves cursor down
      System.out.println( );
      
      // different between print and println
      System.out.println("hi");
      System.out.println("hello ");

      System.out.print("hi");
      System.out.print("hello ");
            
      System.out.println( );
      
      System.out.println("The difference between print and println is that print prints the string,\nbut doesn't move the text cursor to a new line after.");
      System.out.println("println, on the other hand, moves the cursor to a new line after printing."); 
      
      // what it says above:
      // The difference between print and println is that print prints the string,
      // but doesn't move the text cursor to a new line after.
      
      // prinln, on the other hand, moves the cursor to a new line after printing.
      
            
   }
}
