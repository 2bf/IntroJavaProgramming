/***
Chiming Wang
02/09/2023
Java Period 8
MiniProject MyTriangle
***/

//imports packages
import javax.swing.*;
import java.lang.Math.*;
import java.lang.Math;

public class MyTriangle {

   //(1) declaring instance variables
   private MyPoint mypoint;
   MyPoint v1 = new MyPoint(3, 4); //creates points
   MyPoint v2 = new MyPoint(4, 7);
   MyPoint v3 = new MyPoint(-1, 6);
   String name = "";
   
   
   //(2) constructor
   public MyTriangle(MyPoint a, MyPoint b, MyPoint c, String n) {
      v1 = a;
      v2 = b;
      v3 = c;
      name = n;
   }
   
   //mutator methods to change coordinate of vertices
   public void setV1(MyPoint p){
      v1 = p;
   }
   public void setV2(MyPoint p){
      v2 = p;
   }
   public void setV3(MyPoint p){
      v3 = p;
   }
   
   //accessor methods to access coordinates of vertices
   public MyPoint getV1(){
      return v1;
   }
   public MyPoint getV2(){
      return v2;
   }
   public MyPoint getV3(){
      return v3;
   }
    
   //(5) method that returns perimeter of triangle
   public double findPerimeter() {
      double side1 = v1.findDistance(v2);
      double side2 = v2.findDistance(v3);
      double side3 = v3.findDistance(v1);
      double result = side1 + side2 + side3;
      return result;
   }
    
   //(6) method that returns area of triangle using heron's formula
   //herons formula - A = sqrt(s(s-a)(s-b)(s-c)) where s is the semi-perimeter and a, b, and c are the lengths of the 3 sides
   public double findArea() {
      double side1 = v1.findDistance(v2);
      double side2 = v2.findDistance(v3);
      double side3 = v3.findDistance(v1);
      double halfP = findPerimeter() / 2;
      double result = Math.sqrt(halfP * (halfP - side1) * (halfP - side2) * (halfP - side3));
      return result;
   }
    
   //(7)method that displays the type of triangle
   public String displayType() {
      double side1 = v1.findDistance(v2);
      double side2 = v2.findDistance(v3);
      double side3 = v3.findDistance(v1);
      String type = "";
      if (side1 == side2 && side2 == side3) {
         type += "Equilateral";
      } else if (side1 == side2 || side2 == side3 || side3 == side1) {
         type += "Isosceles";
      } else {
         type += "Scalene";
      }
      
      if (side1 * side1 + side2 * side2 == side3 * side3 || side3 * side3 + side2 * side2 == side1 * side1 || side1 * side1 + side3 * side3 == side2 * side2) {
         type += ", Right";
      } else if (side1 * side1 + side2 * side2 < side3 * side3 || side3 * side3 + side2 * side2 < side1 * side1 || side1 * side1 + side3 * side3 < side2 * side2) {
         type += ", Obtuse";
      } else {
         type += ", Acute";
      }
      return type;
   }

   //(4) tostring to return coordinates
   public String toString() {
      String result = "";
      result = "Triangle " + name + ": " + v1 + ", " + v2 + ", " + v3 + "\n";
      result += "Perimeter: " + findPerimeter() + "\n";
      result += "Area: " + findArea() + "\n";
      result += "Triangle Type: " + displayType() + "\n";
      return result;
   }
   
} //public class end
