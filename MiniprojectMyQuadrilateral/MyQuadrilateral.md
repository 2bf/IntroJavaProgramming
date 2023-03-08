# MyQuadrilateral

Design a class called MyQuadrilateral, which models a quadrilateral with 4 vertices, which are four instances of MyPoint. You may assume that the vertices will be given in a circular order (either clockwise or counter-clockwise) and that all four points will be different. Also write a test class to test all the methods defined in the class and display all of the relevant values.
The MyQuadrilateral class contains:
1. Four private instance variables v1, v2, v3, v4 (instances of MyPoint) that represent four vertices, and a String private instance variable that represents the name of the quadrilateral.
2. A constructor that creates a MyQuadrilateral given four instances of MyPoint and the name.
3. Four mutator methods to allow the user to change the coordinates of one of the vertices, and four accessor methods to allow the user to access the coordinates of each vertex.
4. A toString()method that returns a string used to display the coordinates of the vertices of the quadrilateral and the name.
   - Example: ```Quadrilateral ABCD: (3, 4), (4, 7), (2, 8), (-1, 5)```
5. A findPerimeter()method that returns the perimeter of the quadrilateral. You must use the findDistance method from the MyPoint class to receive full credit.
6. A findArea()method that returns the area of the quadrilateral. You must use the findArea method from the MyTriangle class to receive full credit. As a hint, a quadrilateral is two adjacent triangles.
7. A diagonalDifference()method that returns the absolute value of the difference in the lengths of the two diagonals of the quadrilateral. You must use the findDistance method from the MyPoint class to receive full credit.
8. An isIsoscelesTrapezoid() method that returns true if the quadrilateral is an isosceles trapezoid. You must use the diagonalDifference method properly to receive full credit.
9. An isBigger method that accepts another quadrilateral as a parameter and returns true if this quadrilateral has a larger area than the parameter. You must use the findArea method from the MyQuadrilateral class properly to receive full credit.

Sample output (don’t worry about rounding issues with the output):

```
Quadrilateral ABCD: (3, 4), (4, 7), (2, 8), (-1, 5)
Quadrilateral EFGH: (-2, 1), (3, 2), (1, 6), (-3, 7)
Perimeter (ABCD): 13.764091950405117
Perimeter (EFGH): 19.777023624508242
Area (ABCD): 11.000000000000002
Area (EFGH): 22.499999999999993
Diagonal difference (ABCD): 1.2620591815168432
Diagonal difference (EFGH): 1.9792977810613532
isIsoscelesTrapezoid (ABCD): false
isIsoscelesTrapezoid (EFGH): false
isBigger (ABCD is bigger than EFGH): false
```
Please make sure that you have each of the following methods in your MyQuadrilateral class.
```
public MyQuadrilateral(MyPoint a, MyPoint b, MyPoint c, MyPoint d, String n)
public void setV1(MyPoint p)
public void setV2(MyPoint p)
public void setV3(MyPoint p)
public void setV4(MyPoint p)
public MyPoint getV1()
public MyPoint getV2()
public MyPoint getV3()
public MyPoint getV4()
public String toString()
public double findPerimeter()
public double findArea()
public double diagonalDifference()
public boolean isIsoscelesTrapezoid ()
public boolean isBigger(MyQuadrilateral other)
```
And please do NOT CHANGE these signatures.
You must submit 4 classes (MyPoint, MyTriangle, MyQuadrilateral, and MyQuadrilateralDriver)
