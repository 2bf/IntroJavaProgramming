/***
Chiming Wang
9/29/2022
Java Period 8
Project 1: Calculator
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Calculator
{
   
   public static void main (String[] args)
   {
      //declares integers (for operation) and doubles for input numbers
      int operation; //integer
      double num1, num2, num3;
      double quotient;
      
      //declares scanners
      Scanner scan = new Scanner (System.in);
      Scanner num1scan = new Scanner (System.in);
      
      //scanner for user to imput number
      System.out.println("Which operation do you wish to use?"); 
      System.out.println("For addition, type '1' | For subtraction, type '2'");
      System.out.println("For multiplication, type '3' | For division, type '4'");
      System.out.println("To square a number, type '5' | For absolute value, type '5'");
      System.out.println("Please type your desired operation: ");
      operation = scan.nextInt();
      
      //addition calculator
      if (operation == 1) {
         System.out.println("You chose addition.");
         System.out.println("Please type your first addend:");
         num1 = num1scan.nextDouble();
         System.out.println("Please type your second addend:");
         num2 = num1scan.nextDouble();
         num3 = num1 + num2;
         System.out.println("The answer is: " + num3);
         
      //subtraction calculator
      } if (operation == 2) {
         System.out.println("You chose subtraction.");
         System.out.println("Please type the number you want to subtract from:");
         num1 = num1scan.nextDouble();
         System.out.println("Please type the number you want to subtract:");
         num2 = num1scan.nextDouble();
         num3 = num1 - num2;
         System.out.println("The answer is: " + num3);
         
      //multiplication calculator
      } if (operation == 3) {
         System.out.println("You chose multiplication.");
         System.out.println("Please type the first factor (number you want to multiply)");
         num1 = num1scan.nextDouble();
         System.out.println("Please type the second factor");
         num2 = num1scan.nextDouble();
         num3 = num1 * num2;
         System.out.println("The answer is: " + num3);
         
      //division calculator
      } if (operation == 4) {
         System.out.println("You chose division.");
         System.out.println("Please type the dividend:");
         num1 = num1scan.nextDouble();
         System.out.println("Please type the divisor:");
         num2 = num1scan.nextDouble();
         num3 = num1 / num2;
         System.out.println("The answer is: " + num3);
         
      //square calculator
      } if (operation == 5) {
         System.out.println("You chose square.");
         System.out.println("Type the number you want to square:");
         num1 = num1scan.nextDouble();
         num3 = num1 * num1;
         System.out.println("The answer is: " + num3);
         
      //advanced: abs val
      } if (operation == 6) {
         System.out.println("You chose absolute value.");
         System.out.println("Type the number you want to find the absolute value of:");
         num1 = num1scan.nextDouble();
         double absval = Math.abs(num1);
         System.out.println("The absolute value of " + num1 + " is:" + absval);
      
      //checks if user didn't select operation choices.
      }  if (operation > 6 || operation < 1) {
         System.out.println("Error: you didn't choose any of the given numbers.");
      }
      
      
   }
}
