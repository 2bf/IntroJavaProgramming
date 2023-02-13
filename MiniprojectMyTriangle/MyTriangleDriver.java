/***
Chiming Wang
02/09/2023
Java Period 8
MiniProject MyTriangle
***/

import java.util.Random;

public class MyTriangleDriver {
   public static void main(String[] args) {
      MyPoint p1 = new MyPoint(6, 4);
      MyPoint p2 = new MyPoint(5, -2);
      MyPoint p3 = new MyPoint(7, -2);

      MyTriangle triangle = new MyTriangle(p1, p2, p3, "ABC");

      System.out.println(triangle);

      Random rand = new Random();
      MyPoint rp1 = new MyPoint(rand.nextInt(21) - 10, rand.nextInt(21) - 10);
      MyPoint rp2 = new MyPoint(rand.nextInt(21) - 10, rand.nextInt(21) - 10);
      MyPoint rp3 = new MyPoint(rand.nextInt(21) - 10, rand.nextInt(21) - 10);
      MyTriangle randomTri = new MyTriangle(rp1, rp2, rp3, "(randomly generated)");
        
      System.out.println(randomTri);
    }
}
