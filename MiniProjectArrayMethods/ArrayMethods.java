/***
Chiming Wang
03/15/2022
Java Period 8
ArrayMethods
***/

import java.util.Scanner;

public class ArrayMethods {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean repeat = true; //for while loop
      
      //user i/o - uses while loop so the player can run program multiple times and quit when needed
      while (repeat) {
         //user inputs function choice
         System.out.println("Choice 1: Reverse an array");
         System.out.println("Choice 2: Get the smallest element of an array");
         System.out.println("Choice 3: Get theargest element of an array");   
         System.out.print("Enter your choice (a number between 1 and 3, inclusive): ");
         int choice = scanner.nextInt();

         //user inputs array size
         System.out.print("Enter the number of values in the array: ");
         int size = scanner.nextInt();
         int[] arr = new int[size];

         //user inputs array values
         for (int i = 0; i < size; i++) {
            System.out.print("Enter array element " + i + ": ");
            arr[i] = scanner.nextInt();
         }

         //output
         if (choice == 1) {
            int[] reversed = reverseArray(arr);
            System.out.print("\nThe array you entered is: ");
            printArray(arr);
            System.out.print("Your array in reverse is: ");
            printArray(reversed);
         } else if (choice == 2) {
            int smallest = smallestValue(arr);
            System.out.print("The smallest value in your array is: " + smallest);
         } else if (choice == 3) {
            int largest = largestValue(arr);
            System.out.print("The largest value in your array is: " + largest);
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

   //takes array as parameter, returns array in reverse order
   public static int[] reverseArray(int[] arr) {
      int[] reversed = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
         reversed[i] = arr[arr.length - i - 1];
      }
      return reversed;
   } //public static int reversearray end

   //takes integer array as parameter, returns smallest value in array
   public static int smallestValue(int[] arr) {
      int smallest = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] < smallest) {
            smallest = arr[i];
         }
      } //for loop end
      return smallest;
   } //public static int smallestvalue end

   //takes integerarray as parameter, returns largest value in array
   public static int largestValue(int[] arr) {
      int largest = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > largest) {
                largest = arr[i];
         }
      } //for loop end
      return largest;
   } //public static int largestvalue end

   //method to print array as output, to tell the user what they inputted
   public static void printArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         int l = arr.length - 1;
         if (i == 0) {
            System.out.print("{" + arr[i] + ", ");
         }
         if (i == l) {
            System.out.println(arr[i] + "} ");
         } if (i > 0 && i < l) {
            System.out.print(arr[i] + ", ");
         }
      } //for loop end
   } //public static void printarray end
   
} //public class arraymethods end
