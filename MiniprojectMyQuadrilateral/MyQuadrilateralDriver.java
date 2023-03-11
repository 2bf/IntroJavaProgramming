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
      String name = "ABCD";
      MyQuadrilateral quad = new MyQuadrilateral(p1, p2, p3, p4, name);
      
      MyPoint o1 = new MyPoint(-2, 1);
      MyPoint o2 = new MyPoint(3, 2);
      MyPoint o3 = new MyPoint(1, 6);
      MyPoint o4 = new MyPoint(-3, 7);
      String othername = "EFGH";
      MyQuadrilateral other = new MyQuadrilateral(o1, o2, o3, o4, othername);

      System.out.println(quad);
      System.out.println(other);
      
      String result = "";
      result += "Perimeter (" + name + "): " + quad.findPerimeter() + "\n";
      result += "Perimeter (" + othername + "): " + other.findPerimeter() + "\n";
      result += "Area (" + name + "): " + quad.findArea() + "\n";      
      result += "Area (" + othername + "): " + other.findArea() + "\n";
      result += "Diagonal difference (" + name + "): " + quad.diagonalDifference() + "\n";
      result += "Diagonal difference (" + othername + "): " + other.diagonalDifference() + "\n";
      result += "isIsoscelesTrapezoid (" + name + "): " + quad.isIsoscelesTrapezoid() + "\n";
      result += "isIsoscelesTrapezoid (" + othername + "): " + other.isIsoscelesTrapezoid() + "\n";
      result += "isBigger (" + name + " is bigger than " + othername + "): " + quad.isBigger(other) + "\n";
      System.out.println(result);


    }
}
