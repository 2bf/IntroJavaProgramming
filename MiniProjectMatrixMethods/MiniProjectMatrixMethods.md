# MiniProject MatrixMethods

Complete the following methods with the given signatures. All user input and output must occur in your main method. You are permitted to create other methods if you feel they would help you complete the task. Call your java file MatrixMethods. This is to be submitted to Classroom by the date posted on Classroom. You are only completing one java file for this mini-project. For this program, you may use Scanner or JOptionPane.

In your main method, display a menu to ask the user for their desired task. The options are listed below. Once the user chooses a task, ask them for their desired number of rows and number of columns. Then, prompt them to fill the array with integer values. When displaying an array, all entries must be displayed row-by-row (see below for sample output). When the process is complete, ask the user if they want to do it again.

```public static int sumOfRow(int[][] arr, int row)```
This method takes both an integer matrix and an integer as parameters and returns the sum of the
elements in that row.

```public static double averageOfRows(int[][] arr)```
This method takes an integer matrix as a parameter and returns the average of all rows in the matrix.

```public static int largestRow(int[][] arr)```
This method takes an integer matrix as a parameter and returns the row index with the largest sum.


This project will be graded on:
1. Documentation (4 points): Your code must be fully commented and employ standard Java-style
conventions.
2. User-Friendliness (4 points): All interactions with the user must be clear and unambiguous.
3. Methods (12 points): Each method has the proper signature and works as expected.
4. 
TOTAL: 20 points

Example runs of the program:
```
1. Sum of row
2. Average of rows
3. Largest row
Enter your choice: 1
Enter the number of rows: 2
Enter the number of columns: 3
Enter element 0, 0: -3
Enter element 0, 1: 4
Enter element 0, 2: 12
Enter element 1, 0: 19
Enter element 1, 1: -8
Enter element 1, 2: 0
You entered:
-3 4 12
19 -8 0
Enter row: 1
The sum of row 1 is 11.
Again? (1 for yes, 2 for no): 1

1. Sum of row
2. Average of rows
3. Largest row
Enter your choice: 3
Enter the number of rows: 2
Enter the number of columns: 3
Enter element 0, 0: -3
Enter element 0, 1: 4
Enter element 0, 2: 12
Enter element 1, 0: 19
Enter element 1, 1: -8
Enter element 1, 2: 0
You entered:
-3 4 12
19 -8 0
The row with the largest sum is row 0.
Again? (1 for yes, 2 for no): 1
```

note that, for these examples, averageOfRows would return 12.0
