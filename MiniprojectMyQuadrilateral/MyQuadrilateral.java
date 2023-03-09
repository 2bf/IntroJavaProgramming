/***
Chiming Wang
02/27/2023
Java Period 8
MiniProject MyQuadrilateral
***/

//imports packages
import javax.swing.*;
import java.lang.Math.*;
import java.lang.Math;

public class MyQuadrilateral {
   
   //(1) declaring instance variables
   private MyPoint mypoint;
   MyPoint v1 = new MyPoint(3,4);
   MyPoint v2 = new MyPoint(4,7);
   MyPoint v3 = new MyPoint(2,8);
   MyPoint v4 = new MyPoint(-1,5);
   String name = "";
   MyTriangle tri1 = new MyTriangle(v1, v3, v2, "tri1");
   MyTriangle tri2 = new MyTriangle(v3, v4, v1, "tri2");
   
   //(2) constructor
   public MyQuadrilateral(MyPoint a, MyPoint b, MyPoint c, MyPoint d, String n){
      v1 = a;
      v2 = b;
      v3 = c;
      v4 = d;
      name = n;
   }
   
   //(3) mutator methods to change coordinate of vertices
   public void setV1(MyPoint p){
      v1 = p;
   }
   public void setV2(MyPoint p){
      v2 = p;
   }
   public void setV3(MyPoint p){
      v3 = p;
   }
   public void setV4(MyPoint p){
      v4 = p;
   }
   
   //(3) accessor methods to access coordinates of vertices
   public MyPoint getV1(){
      return v1;
   }
   public MyPoint getV2(){
      return v2;
   }
   public MyPoint getV3(){
      return v3;
   }
   public MyPoint getV4(){
      return v4;
   }
   
   //(5) method that returns perimeter of quadrilateral
   public double findPerimeter() {
      double side1 = v1.findDistance(v2);
      double side2 = v2.findDistance(v3);
      double side3 = v3.findDistance(v4);
      double side4 = v4.findDistance(v1);
      double result = side1 + side2 + side3 + side4;
      return result;
   }
   
   //(6) method that returns area of quadrilateral
   public double findArea() {
      MyTriangle tri1 = new MyTriangle(v1, v3, v2, "tri1");
      MyTriangle tri2 = new MyTriangle(v3, v4, v1, "tri2");
      double tri1area = tri1.findArea();
      double tri2area = tri2.findArea();
      double sumarea = tri1area + tri2area;
      return sumarea;
      
   }
   
   //(7) method that returns absolute value of difference in lengths of 2 diagonals of quadrilateral
   public double diagonalDifference() {
      double diag1 = v1.findDistance(v3);
      double diag2 = v2.findDistance(v4);
      double diff = Math.abs(diag1 - diag2);
      return diff;
   }
   
   //(8) method that returns if quadrilateral is isosceles trapezoid
   public boolean isIsoscelesTrapezoid (){
      if (diagonalDifference() == 0) {
         return true;
      } else {
         return false;
      }
   }
   
   //(9) method that accepts another quadrilateral as a paramter and checks if this quadrilateral has a larger area than the parameter
   public boolean isBigger(MyQuadrilateral other){
      double areaOther = other.findArea();
      double area = findArea();
      if (areaOther > area) {
         return false;
      } else {
         return true;
      }
   }
   
   //(4) tostring to return coordinates
   public String toString() {
      String result = "";
      result = "Quadrilateral " + name + ": " + v1 + ", " + v2 + ", " + v3 + ", " + v4;
      /**
      result += "Perimeter (" + name +  "): " + findPerimeter() + "\n";
      result += "Area (" + name +  "): " + findArea() + "\n";
      result += "Diagonal Difference (" + name +  "): " + diagonalDifference() + "\n";
      result += "isIsoscelesTrapezoid (" + name +  "): " + isIsoscelesTrapezoid() + "\n";
      result += isBigger(other);
      //result += "isBigger (" + name + " is bigger than the other quadrilateral) :" + isBigger(MyQuadrilateral other) + "\n";
      **/
      return result;
   }
      
} //public class end
