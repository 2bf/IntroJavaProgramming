/***
Chiming Wang
10/26/2022
Java Period 8
Miniproject: Methods
***/

import java.lang.Math;
import java.util.Scanner;

public class Methods {  
   public static void main (String[] args){
      
      //ints for values - makes it easier to change values
      int input, operation;
      int mid1, mid2, mid3;
      
      Scanner scan = new Scanner (System.in);

      //scanner and instructions for user to imput number
      System.out.println("Which operation do you wish to use?"); 
      System.out.println("For factorial, type '1'");
      System.out.println("For sum of digits, type '2'");
      System.out.println("To check if a number is perfect, type '3'");
      System.out.println("To find the average of all the digits of a number, type '4'");
      System.out.println("To find if the average of any 2 numbers is the 3rd number, type '5'");
      System.out.println("Please type your desired operation: ");
      operation = scan.nextInt();
      
      
      if (operation == 1) {
         System.out.println("You chose factorial.");
         System.out.println("Please type your chosen number:");
         input = scan.nextInt();
         System.out.println(input + "! is: " + factorial(input));
         
      } if (operation == 2) {
         System.out.println("You chose sum of digits.");
         System.out.println("Please type your chosen number:");
         input = scan.nextInt();
         System.out.println("The sum of all the digits in " + input + " is: " + sumOfDigits(input));
         
      } if (operation == 3) {
         System.out.println("You chose to check if a number is perfect.");
         System.out.println("Please type your chosen number:");
         input = scan.nextInt();
         if (isPerfect(input) == true) {
            System.out.println(input + " is a perfect number.");
         } else
            System.out.println(input + " is not a perfect number.");
            
      } if (operation == 4) {
         System.out.println("You chose average of all digits in a number.");
         System.out.println("Please type your chosen number:");
         input = scan.nextInt();
         System.out.println("The average of all the digits in " + input + " is: " + averageDigit(input));
         
      } if (operation == 5) {
         System.out.println("You chose to check if a set of 3 numbers has a midpoint in it.");
         System.out.println("Please type your first number:");
         mid1 = scan.nextInt();
         System.out.println("Please type your second number:");
         mid2 = scan.nextInt();
         System.out.println("Please type your third number:");
         mid3 = scan.nextInt();
         if (hasMidpoint(mid1, mid2, mid3) == true) {
            System.out.println("There is a number that is the midpoint of the other two.");
         } else
            System.out.println("None of these numbers is the midpoint of the other two.");
            
      } if (operation > 5) {
         System.out.println("ERROR: you chose option " + operation + ", which doesn't exist.");
      }
   }

   //factorial 
   public static int factorial (int n){
      int f = 1;
      for (int i = 2; i <= n; i++) {
        f = f * i;
    }
    return f;
   }
   
   //sum of all digits in a number
   public static int sumOfDigits (int n){
      int x = 0;
        
      //only does this if n is not equal to 0
      //if n is equal to 0, prints 0
      while (n != 0)
      {
         x = x + n % 10;
         n = n/10;
      }
     
      return x;
   }
   
   //isperfect
   public static boolean isPerfect(int n){
      int s=0;
      
      for(int i=1; i <= n/2; i++) {  
         if(n % i == 0){   
         s=s + i;  
         }
      }
      if (s == n) {
         return true;
      } else
         return false;   
   }
   
   //averagedigit
   public static double averageDigit(int n){
      int d = 0;
      double s = 0;
      while (n > 0) {
         d += 1;
         s += n%10;
         n /=10; //divides n by 10 then sets it equal to the answer
      }
         return(s/d);
   }
   
   //hasmidpt 
   public static boolean hasMidpoint(double a, double b, double c){
      double x = (a + b)/2;
      double y = (a + c)/2;
      double z = (b + c)/2;
      
      if (x == c || y == b || z == a) {
         return true;
      }
      else 
         return false;
   }         
}   
