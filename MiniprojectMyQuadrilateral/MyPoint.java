/***
Chiming Wang
02/02/2022
Java Period 8
MiniProject MyPoint
***/

//imports packages
import javax.swing.*;
import java.lang.Math.*;
import java.lang.Math;

public class MyPoint {

   //(1) declaring instance variables
   private int xCoordinate, yCoordinate;
   
   //(2) constructor
   public MyPoint() {
      xCoordinate = 0;
      yCoordinate = 0;
   }
   
   //(3) overloaded constructor
   public MyPoint(int x, int y) {
      xCoordinate = x;
      yCoordinate = y;
   }
  
   //(4) accessor methods
   public int getX() {
      return xCoordinate;
   }
   public int getY() {
      return yCoordinate;
   }
   
   //(5) setXY
   public void setXY(int x, int y) {
      this.xCoordinate = x;
      this.yCoordinate = y;
   }
   
   //(6) findDistance
   public double findDistance(int x, int y) {
      int xDiff = Math.abs(xCoordinate - x); //absolute value
      int yDiff = Math.abs(yCoordinate - y);
      double result = Math.abs(Math.sqrt((xDiff * xDiff) + (yDiff * yDiff)));
      return result;
   }
   
   //(7) findDistance overloaded
   public double findDistance(MyPoint p) {
      return findDistance(p.getX(), p.getY());
   }
   
   //(8) findSlope method that returns slope from one point to other
   public double findSlope(int x, int y){
      double xDiff = xCoordinate - x; //returns -4.0, but returns 4.0 when overloaded ???  [[problem solved, i just had it as an int instead of a double before]]
      double yDiff = yCoordinate - y; //returns 3.0, but returns -3.0 when overloaded ???  [[problem solved, i just had it as an int instead of a double before]]
      double result = yDiff/xDiff;
      return result;
   }
   
   //(9) findSlope overloaded
   public double findSlope(MyPoint p) {
      return findSlope(p.getX(), p.getY());
   }
   
   //(10) tostring method - print out coordinates of a point
   public String toString() {
      String result = ("(" + xCoordinate + "," + yCoordinate + ")");
      return result;
   }
   
   
} //public class end
