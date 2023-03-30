/***
Chiming Wang
03/29/2023
Java Period 8
MatrixMethods
***/

import java.util.Scanner;

public class MatrixMethods {
    
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean repeat = true; //for while loop
        
      //user i/o - uses while loop so the player can run program multiple times and quit when needed

      while (repeat) {
         //user inputs function choice
         System.out.println("Choice 1: Sum of row");
         System.out.println("Choice 2: Average of rows");
         System.out.println("Choice 3: Largest row");
         System.out.print("Enter your choice (a number between 1 and 3, inclusive): ");
         int choice = scanner.nextInt();
         
         //user inputs num of rows
         System.out.print("Enter the number of rows: ");
         int numRows = scanner.nextInt();
         
         //user inputs num of columns
         System.out.print("Enter the number of columns: ");
         int numCols = scanner.nextInt();
         int[][] matrix = new int[numRows][numCols];
         for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
               System.out.print("Enter element " + i + ", " + j + ": ");
               matrix[i][j] = scanner.nextInt();
            }
         }
         System.out.println("The matrix you entered is:");
         printM(matrix); //uses method to print matrix
         
         //output
         if (choice == 1) {
            System.out.print("Enter row: ");
            int row = scanner.nextInt() - 1; //makes is so that the first row is row 1, not row 0
            int sum = sumOfRow(matrix, row);
            System.out.println("The sum of row " + row + " is " + sum + ".");
         } else if (choice == 2) {
            double avg = averageOfRows(matrix);
            System.out.println("The average of all rows is " + avg + ".");
         } else if (choice == 3) {
            int largestRow = largestRow(matrix);
            System.out.println("The row with the largest sum is: row " + largestRow + ".");
         } else {
            System.out.println("\nYou chose an invalid choice: Choice " + choice + " does not exist.");
         }
         
         //checks if user wants to repeat program again
         System.out.print("\nWould you like to run this again? Press 1 for yes, and 2 (or anything other than 1) for no: ");
         int repeatChoice = scanner.nextInt();
         if (repeatChoice != 1) {
            repeat = false;
         } //if loop end
      } //while loop end
   } //public static void main end
   
   //gets integer matrix and integer as parameters, returns sum of elements in row
   public static int sumOfRow(int[][] arr, int row) {
      int sum = 0;
      for (int j = 0; j < arr[row].length; j++) {
         sum += arr[row][j];
      }
      return sum;
   } //public static int sumofrow end
   
   //takes integer matrix as paramater, returns avg of all rows in matrix
   public static double averageOfRows(int[][] arr) {
      double sum = 0;
      for (int i = 0; i < arr.length; i++) {
         sum += sumOfRow(arr, i);
      } //for loop end
      return sum / arr.length;
   } //public static double averageofrows end
   
   //takes integer matrix as parameter, returns row index with largest sum
   public static int largestRow(int[][] arr) {
      int largestSum = 0;
      int largestRow = 0;
      for (int i = 0; i < arr.length; i++) {
         int rowSum = 0;
         for (int j = 0; j < arr[i].length; j++) {
            rowSum += arr[i][j];
         }
      if (rowSum > largestSum) {
         largestSum = rowSum;
         largestRow = i;
      }
   }
   return largestRow;
   } //public static int largestrow end
    
   //for printing matrix
   public static void printM(int[][] arr) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      } //for loop end
   } //public static void printm end
} //public class matrixmethods end
