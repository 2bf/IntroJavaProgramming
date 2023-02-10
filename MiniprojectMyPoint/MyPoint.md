# MyPoint
## Due Feb 02 2023

Design a class called MyPoint, which models a 2D point with x and y coordinates and contains:
1. Two instance variables xCoordinate (of type int) and yCoordinate (of type int).
2. A default constructor that sets the coordinates of the point to (0, 0).
3. An overloaded constructor that creates a point with the given x and y coordinates.
4. Accessor methods for the instance variables.
5. A method setXY(...) to set both x and y to the given values.
6. A method findDistance(int x, int y) that returns the distance from this point to the other
point at the given (x, y) coordinates.
7. An overloaded method findDistance(MyPoint p) that returns the distance from this
point to the MyPoint instance of p. You must use findDistance from above appropriately
to receive credit.
8. A method findSlope(int x, int y) that returns the slope from this point to the other point
at the given (x, y) coordinates.
9. An overloaded method findSlope(MyPoint p) that returns the slope from this point to
the MyPoint instance of p. You must use findSlope from above appropriately to receive
credit.
10. A toString method used to print out the coordinates of a point.

Test the MyPoint class in a driver class, making two points A and B. Display the
coordinates of the points, the distance between them, and the slope of the line segment
connecting the two points according to the following example:
```
Point A = (3, 2)
Point B = (7, -1)
Distance = 5
Distance using the other method call = 5
Slope = -0.75
Slope using the other method call = -0.75
Also include statements to show that you tested the accessor and setXY methods.
When testing the findSlope method, include a conditional that only allows the computer
to call the method if the x-coordinates of both points are not the same. Otherwise,
display that the slope is undefined.
```

Please make sure that you have each of the following methods in your MyPoint class.
```
public MyPoint()
public MyPoint(int x, int y)
public int getX()
public int getY()
public void setXY(int x, int y)
public String toString()
public double findDistance(int x, int y)
public double findDistance(MyPoint p)
public double findSlope(int x, int y)
public double findSlope(MyPoint p)
And please do NOT CHANGE these signatures.
You must submit both classes (MyPoint and MyPointDriver)
```
