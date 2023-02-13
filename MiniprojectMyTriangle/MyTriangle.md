Design a class called MyTriangle, which models a triangle with 3 vertices, which are three instances of MyPoint (from miniproject mypoint). Also write a test class to test all the methods defined in the class and display all of the relevant values.
The MyTriangle class contains:
1. Three private instance variables v1, v2, v3 (instances of MyPoint) that represent three vertices, and a String private instance variable that represents the name of the triangle.
2. A constructor that creates a MyTriangle given three instances of MyPoint and the name.
3. Three mutator methods to allow the user to change the coordinates of one of the vertices, and three accessor methods to allow the user to access the coordinates of each vertex.
4. A toString()method that returns a string used to display the coordinates of the vertices of the triangle and the name.
   - Example: Triangle ABC: (3, 4), (4, 7), (-1, 6)
5. A findPerimeter()method that returns the perimeter of the triangle. You must use the findDistance method from the MyPoint class to receive full credit.
6. A findArea()method that returns the area of the triangle. You must use the findPerimeter method from above and the findDistance method from the MyPoint class to receive full credit. Use Heron’s Formula to calculate the area.
   - Heron’s formula states that the area of a triangle can be found using the semi-perimeter (half the perimeter) and the length of each side. The formula is A = √s(s − a)(s − b)(s − c), where s is the semi-perimeter and a, b, and c are the lengths of the 3 sides.
7. A displayType()method that returns a string used to display the type of triangle
   - (“Equilateral” if all sides are congruent, “Scalene” if none of the sides are congruent, or “Isosceles” if two sides are congruent.)
   - BONUS: Also return “Right”, “Acute”, or “Obtuse”.
   - Another BONUS: Randomly generate the coordinates (range of −10 to 10) of the three points (in the driver class), and determine if the three points form a triangle (in the constructor). If not, then display an appropriate message and end the program using System.exit(0);
Sample output (due to rounding errors, an answer for the area of 6 would be correct as well):
```
Triangle ABC: (6, 4), (5, -2), (7, -2)
Perimeter: 14.165525060596437
Area: 5.999999999999994
Type: Acute Isosceles
```

Please make sure that you have each of the following methods in your MyTriangle class.
```
public MyTriangle(MyPoint a, MyPoint b, MyPoint c, String n)
public void setV1(MyPoint p)
public void setV2(MyPoint p)
public void setV3(MyPoint p)
public MyPoint getV1()
public MyPoint getV2()
public MyPoint getV3()
public String toString()
public double findPerimeter()
public double findArea()
public String displayType()
```
And please do NOT CHANGE these signatures.
You must submit 3 classes (MyPoint, MyTriangle, and MyTriangleDriver)
