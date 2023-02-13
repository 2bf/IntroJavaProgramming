/***
Chiming Wang
02/02/2022
Java Period 8
MiniProject MyPoint
***/

//imports packages
import javax.swing.*;
import java.text.DecimalFormat;

public class MyPointDriver{

   public static void main(String[] args){
      MyPoint A = new MyPoint(3,2); //creates points
      MyPoint B = new MyPoint(7,-1);
      
      //prints points
      System.out.println("Point A: " + A);
      System.out.println("Point B: " + B);
      
      //find distance between points and overload method
      System.out.println("Distance: " + A.findDistance(B));
      System.out.println("Distance using the other method call (???): " + B.findDistance(A));
      
      //find slope and then overload method
      if (A.getX() != B.getX()) {
         System.out.println("Slope: " + A.findSlope(B));
         System.out.println("Slope using the other method call: " + B.findSlope(A)); 
      } else {
         System.out.println("Slope is undefined."); //makes sure to tell user when slope is undefined when x coordinates are the same
      }
      
      //test accessor methods
      System.out.println("Accessor methods test: The x-coordinate of Point A is " + A.getX());
      System.out.println("Accessor methods test: The y-coordinate of Point A is " + A.getY());
        
      //test setXY method
      A.setXY(5,-2);
      System.out.println("setXY method test: After using setXY method, point A is: " + A);
        
   }
}      
