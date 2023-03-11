/***
Chiming Wang
02/28/2023
Java Period 8
MiniProject MyQuadrilateral
***/

import java.util.Random;

public class MyQuadrilateralDriver {
   public static void main(String[] args) {
      MyPoint p1 = new MyPoint(3, 4);
      MyPoint p2 = new MyPoint(4, 7);
      MyPoint p3 = new MyPoint(2, 8);
      MyPoint p4 = new MyPoint(-1,5);
      MyQuadrilateral quad = new MyQuadrilateral(p1, p2, p3, p4, "ABCD");
      
      MyPoint o1 = new MyPoint(-2, 1);
      MyPoint o2 = new MyPoint(3, 2);
      MyPoint o3 = new MyPoint(1, 6);
      MyPoint o4 = new MyPoint(-3, 7);
      MyQuadrilateral other = new MyQuadrilateral(o1, o2, o3, o4, "EFGH");

      System.out.println(quad);
      System.out.println(other);
      
      String result = "";
      result += "Perimeter (" + quad.getName() + "): " + quad.findPerimeter() + "\n";
      result += "Perimeter (" + other.getName() + "): " + other.findPerimeter() + "\n";
      result += "Area (" + quad.getName() + "): " + quad.findArea() + "\n";      
      result += "Area (" + other.getName() + "): " + other.findArea() + "\n";
      result += "Diagonal difference (" + quad.getName() + "): " + quad.diagonalDifference() + "\n";
      result += "Diagonal difference (" + other.getName() + "): " + other.diagonalDifference() + "\n";
      result += "isIsoscelesTrapezoid (" + quad.getName() + "): " + quad.isIsoscelesTrapezoid() + "\n";
      result += "isIsoscelesTrapezoid (" + other.getName() + "): " + other.isIsoscelesTrapezoid() + "\n";
      result += "isBigger (" + quad.getName() + " is bigger than " + other.getName() + "): " + quad.isBigger(other) + "\n";
      System.out.println(result);


    }
}
